/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.workflow.core;

import org.apache.airavata.common.exception.AiravataException;
import org.apache.airavata.common.utils.ServerSettings;
import org.apache.airavata.messaging.core.MessageContext;
import org.apache.airavata.messaging.core.MessageHandler;
import org.apache.airavata.messaging.core.MessagingConstants;
import org.apache.airavata.messaging.core.impl.RabbitMQProcessLaunchPublisher;
import org.apache.airavata.messaging.core.impl.RabbitMQStatusConsumer;
import org.apache.airavata.model.messaging.event.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkflowEnactmentService {

    private static WorkflowEnactmentService workflowEnactmentService;
    private final RabbitMQStatusConsumer statusConsumer;
    private String consumerId;
    private ExecutorService executor;
    private Map<String,WorkflowInterpreter> workflowMap;

    private WorkflowEnactmentService () throws AiravataException {
        executor = Executors.newFixedThreadPool(getThreadPoolSize());
        workflowMap = new ConcurrentHashMap<String, WorkflowInterpreter>();
        statusConsumer = new RabbitMQStatusConsumer();
        consumerId = statusConsumer.listen(new TaskMessageHandler());
        // register the shutdown hook to un-bind status consumer.
        Runtime.getRuntime().addShutdownHook(new EnactmentShutDownHook());
    }

    public static WorkflowEnactmentService getInstance() throws AiravataException {
        if (workflowEnactmentService == null) {
            synchronized (WorkflowEnactmentService.class) {
                if (workflowEnactmentService == null) {
                    workflowEnactmentService = new WorkflowEnactmentService();
                }
            }
        }
        return workflowEnactmentService;
    }

    public void submitWorkflow(String experimentId,
                                  String credentialToken,
                                  String gatewayName,
                                  RabbitMQProcessLaunchPublisher publisher) throws Exception {

        WorkflowInterpreter workflowInterpreter = new WorkflowInterpreter(
                experimentId, credentialToken,gatewayName, publisher);
        workflowMap.put(experimentId, workflowInterpreter);
        workflowInterpreter.launchWorkflow();

    }

    private int getThreadPoolSize() {
        return ServerSettings.getEnactmentThreadPoolSize();
    }

    private class TaskMessageHandler implements MessageHandler {

        @Override
        public Map<String, Object> getProperties() {
            Map<String, Object> props = new HashMap<String, Object>();
            String gatewayId = "*";
            String experimentId = "*";
            List<String> routingKeys = new ArrayList<String>();
            routingKeys.add(gatewayId);
            routingKeys.add(gatewayId + "." + experimentId);
            routingKeys.add(gatewayId + "." + experimentId+ ".*");
            routingKeys.add(gatewayId + "." + experimentId+ ".*.*");
            props.put(MessagingConstants.RABBIT_ROUTING_KEY, routingKeys);
            return props;
        }

        @Override
        public void onMessage(MessageContext msgCtx) {
            StatusHandler statusHandler = new StatusHandler(msgCtx);
            executor.execute(statusHandler);
        }


    }

    private class StatusHandler implements Runnable{
        private final Logger log = LoggerFactory.getLogger(StatusHandler.class);

        private final MessageContext msgCtx;

        public StatusHandler(MessageContext msgCtx) {
            this.msgCtx = msgCtx;
        }

        @Override
        public void run() {
            process();
        }

        private void process() {
            String message;
            WorkflowInterpreter workflowInterpreter;
            if (msgCtx.getType() == MessageType.PROCESS) {
                ProcessStatusChangeEvent event = ((ProcessStatusChangeEvent) msgCtx.getEvent());
                ProcessIdentifier processIdentity = event.getProcessIdentity();
                workflowInterpreter = getInterpreter(processIdentity.getExperimentId());
                if (workflowInterpreter != null) {
                    workflowInterpreter.handleProcessStatusChangeEvent(event);
                } else {
                    // this happens when Task status messages comes after the Taskoutput messages,as we have worked on
                    // output changes it is ok to ignore this.
                }

            }else if (msgCtx.getType() == MessageType.PROCESSOUTPUT) {
                TaskOutputChangeEvent event = (TaskOutputChangeEvent) msgCtx.getEvent();
                TaskIdentifier taskIdentifier = event.getTaskIdentity();
                workflowInterpreter = getInterpreter(taskIdentifier.getExperimentId());
                if (workflowInterpreter != null) {
//                    workflowInterpreter.handleTaskOutputChangeEvent(event);
                    if (workflowInterpreter.isAllDone()) {
                        workflowMap.remove(taskIdentifier.getExperimentId());
                    }
                } else {
                    throw new IllegalArgumentException("Error while processing TaskOutputChangeEvent, " +
                            "There is no registered workflow for experiment Id : " + taskIdentifier.getExperimentId());
                }
                message = "Received task output change event , expId : " + taskIdentifier.getExperimentId() + ", taskId : " + taskIdentifier.getTaskId();
                log.debug(message);
            } else {
                // not interested, ignores
            }
        }

        private WorkflowInterpreter getInterpreter(String experimentId){
            return workflowMap.get(experimentId);
        }
    }


    private class EnactmentShutDownHook extends Thread {
        private final Logger log = LoggerFactory.getLogger(EnactmentShutDownHook.class);
        @Override
        public void run() {
            super.run();
            try {
                statusConsumer.stopListen(consumerId);
                log.info("Successfully un-binded task status consumer");
            } catch (AiravataException e) {
                log.error("Error while un-bind enactment status consumer", e);
            }
        }
    }
}
