// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Profile for Windows VMs in the container service cluster. */
@Fluent
public final class ManagedClusterWindowsProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterWindowsProfile.class);

    /*
     * The administrator username to use for Windows VMs.
     */
    @JsonProperty(value = "adminUsername", required = true)
    private String adminUsername;

    /*
     * The administrator password to use for Windows VMs.
     */
    @JsonProperty(value = "adminPassword")
    private String adminPassword;

    /**
     * Get the adminUsername property: The administrator username to use for Windows VMs.
     *
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: The administrator username to use for Windows VMs.
     *
     * @param adminUsername the adminUsername value to set.
     * @return the ManagedClusterWindowsProfile object itself.
     */
    public ManagedClusterWindowsProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the adminPassword property: The administrator password to use for Windows VMs.
     *
     * @return the adminPassword value.
     */
    public String adminPassword() {
        return this.adminPassword;
    }

    /**
     * Set the adminPassword property: The administrator password to use for Windows VMs.
     *
     * @param adminPassword the adminPassword value to set.
     * @return the ManagedClusterWindowsProfile object itself.
     */
    public ManagedClusterWindowsProfile withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (adminUsername() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property adminUsername in model ManagedClusterWindowsProfile"));
        }
    }
}
