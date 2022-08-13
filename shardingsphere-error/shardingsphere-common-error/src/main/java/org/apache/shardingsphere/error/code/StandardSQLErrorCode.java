/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.error.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Standard SQL error code.
 */
@RequiredArgsConstructor
@Getter
public enum StandardSQLErrorCode implements SQLErrorCode {
    
    CIRCUIT_BREAK_MODE("C1000", 1000, "Circuit break mode is ON"),
    
    SCALING_JOB_NOT_EXIST("C1201", 1201, "Scaling job `%s` does not exist"),
    
    SCALING_OPERATE_FAILED("C1209", 1209, "Scaling Operate Failed: `%s`"),
    
    DATABASE_WRITE_LOCKED("C1300", 1300, "The database `%s` is read-only"),
    
    TABLE_LOCK_WAIT_TIMEOUT("C1301", 1301, "The table `%s` of schema `%s` lock wait timeout of %s ms exceeded"),
    
    TABLE_LOCKED("C1302", 1302, "The table `%s` of schema `%s` is locked"),
    
    RESOURCE_OR_RULE_NOT_EXIST("42000", 1305, "Data source or rule does not exist"),
    
    UNSUPPORTED_SQL("42000", 1235, "Unsupported SQL: %s"),
    
    UNSUPPORTED_COMMAND("C1998", 1998, "Unsupported command: %s"),
    
    UNKNOWN_EXCEPTION("C1999", 1999, "Unknown exception: %s");
    
    private final String sqlState;
    
    private final int vendorCode;
    
    private final String reason;
}