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

package org.apache.airavata.interpreter.service.client;

import org.apache.airavata.common.exception.ApplicationSettingsException;
import org.apache.airavata.experiment.execution.InterpreterService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.airavata.common.utils.ClientSettings;

public class ExecutionClient {
    public static final String THRIFT_SERVER_PORT = "thrift.server.port";

    public InterpreterService.Client getInterpreterServiceClient (){
        try {
            String thriftPort = ClientSettings.getSetting(THRIFT_SERVER_PORT);
            TTransport transport = new TSocket("localhost", Integer.parseInt(thriftPort));
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            return new InterpreterService.Client(protocol);
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (ApplicationSettingsException e) {
            e.printStackTrace();
        }
        return null;
    }
}
