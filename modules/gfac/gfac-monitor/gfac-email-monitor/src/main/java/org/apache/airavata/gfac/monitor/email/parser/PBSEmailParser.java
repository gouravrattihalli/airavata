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
package org.apache.airavata.gfac.monitor.email.parser;

import org.apache.airavata.common.exception.AiravataException;
import org.apache.airavata.gfac.monitor.email.JobStatusResult;
import org.apache.airavata.model.workspace.experiment.JobState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.Message;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PBSEmailParser implements EmailParser {

    private static final Logger log = LoggerFactory.getLogger(PBSEmailParser.class);


    private static final String REGEX = "[a-zA-Z: ]*(?<" + JOBID + ">[a-zA-Z0-9-\\.]*)\\s+.*\\s+.*\\s+(?<"
            + STATUS + ">[a-zA-Z\\ ]*)";
    private static final String REGEX_EXIT_STATUS = "Exit_status=(?<" + EXIT_STATUS + ">[\\d]+)";

    @Override
    public JobStatusResult parseEmail(Message message) throws MessagingException, AiravataException {
        JobStatusResult jobStatusResult = new JobStatusResult();
        try {
            String content = ((String) message.getContent());
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(content);
            if (matcher.find()) {
                jobStatusResult.setJobId(matcher.group(JOBID));
                String statusLine = matcher.group(STATUS);
                jobStatusResult.setState(getJobState(statusLine, content));
                return jobStatusResult;
            } else {
                log.error("No matched found for content => \n" + content);
            }

        } catch (IOException e) {
            throw new AiravataException("Error while reading content of the email message");
        }
        return jobStatusResult;
    }

    private JobState getJobState(String statusLine, String content) {
        switch (statusLine) {
            case "Begun execution":
                return JobState.QUEUED;
            case "Execution terminated":
                int exitStatus = getExitStatus(content);
                switch (exitStatus) {
                    case 0:
                        return JobState.COMPLETE;
                    case 1:
                        return JobState.FAILED;
                    default:
                        return JobState.UNKNOWN;
                }
            default:
                return JobState.UNKNOWN;
        }
    }

    private int getExitStatus(String content) {
        Pattern pattern = Pattern.compile(REGEX_EXIT_STATUS);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            String group = matcher.group(EXIT_STATUS);
            if (group != null && !group.trim().isEmpty()) {
                return Integer.valueOf(group.trim());
            }
        }
        return -1;
    }

}