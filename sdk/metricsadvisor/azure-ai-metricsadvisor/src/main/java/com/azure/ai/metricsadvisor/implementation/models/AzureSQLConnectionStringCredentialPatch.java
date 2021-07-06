// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The AzureSQLConnectionStringCredentialPatch model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dataSourceCredentialType")
@JsonTypeName("AzureSQLConnectionString")
@Fluent
public final class AzureSQLConnectionStringCredentialPatch extends DataSourceCredentialPatch {
    /*
     * The parameters property.
     */
    @JsonProperty(value = "parameters")
    private AzureSQLConnectionStringParamPatch parameters;

    /**
     * Get the parameters property: The parameters property.
     *
     * @return the parameters value.
     */
    public AzureSQLConnectionStringParamPatch getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     *
     * @param parameters the parameters value to set.
     * @return the AzureSQLConnectionStringCredentialPatch object itself.
     */
    public AzureSQLConnectionStringCredentialPatch setParameters(AzureSQLConnectionStringParamPatch parameters) {
        this.parameters = parameters;
        return this;
    }
}
