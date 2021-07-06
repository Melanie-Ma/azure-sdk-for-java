// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage configuration provides the connection details that allows the Time Series Insights service to connect to
 * the customer storage account that is used to store the environment's data.
 */
@Fluent
public final class Gen2StorageConfigurationInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Gen2StorageConfigurationInput.class);

    /*
     * The name of the storage account that will hold the environment's Gen2
     * data.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /*
     * The value of the management key that grants the Time Series Insights
     * service write access to the storage account. This property is not shown
     * in environment responses.
     */
    @JsonProperty(value = "managementKey", required = true)
    private String managementKey;

    /**
     * Get the accountName property: The name of the storage account that will hold the environment's Gen2 data.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The name of the storage account that will hold the environment's Gen2 data.
     *
     * @param accountName the accountName value to set.
     * @return the Gen2StorageConfigurationInput object itself.
     */
    public Gen2StorageConfigurationInput withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the managementKey property: The value of the management key that grants the Time Series Insights service
     * write access to the storage account. This property is not shown in environment responses.
     *
     * @return the managementKey value.
     */
    public String managementKey() {
        return this.managementKey;
    }

    /**
     * Set the managementKey property: The value of the management key that grants the Time Series Insights service
     * write access to the storage account. This property is not shown in environment responses.
     *
     * @param managementKey the managementKey value to set.
     * @return the Gen2StorageConfigurationInput object itself.
     */
    public Gen2StorageConfigurationInput withManagementKey(String managementKey) {
        this.managementKey = managementKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property accountName in model Gen2StorageConfigurationInput"));
        }
        if (managementKey() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property managementKey in model Gen2StorageConfigurationInput"));
        }
    }
}
