// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Additional error info. */
@Fluent
public final class AdditionalErrorInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdditionalErrorInfo.class);

    /*
     * Additional error type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Additional error info.
     */
    @JsonProperty(value = "info")
    private Object info;

    /**
     * Get the type property: Additional error type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Additional error type.
     *
     * @param type the type value to set.
     * @return the AdditionalErrorInfo object itself.
     */
    public AdditionalErrorInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the info property: Additional error info.
     *
     * @return the info value.
     */
    public Object info() {
        return this.info;
    }

    /**
     * Set the info property: Additional error info.
     *
     * @param info the info value to set.
     * @return the AdditionalErrorInfo object itself.
     */
    public AdditionalErrorInfo withInfo(Object info) {
        this.info = info;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
