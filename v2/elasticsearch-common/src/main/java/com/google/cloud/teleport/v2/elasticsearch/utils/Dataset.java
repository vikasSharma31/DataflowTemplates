/*
 * Copyright (C) 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.teleport.v2.elasticsearch.utils;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum of possible dataset values.
 */
public enum Dataset {
    AUDIT,
    VPCFLOW,
    FIREWALL,
    PUBSUB;

    @JsonValue
    public String getKey() {
        return name().toLowerCase();
    }

    /**
     * This method is used to get Dataset literal with the "gcp." prefix.
     * **/
    public String getKeyWithPrefix() {
        return "gcp." + name().toLowerCase();
    }
}
