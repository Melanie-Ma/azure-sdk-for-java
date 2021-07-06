// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Restore files/folders from a backup copy of IaaS VM. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("IaasVMILRRegistrationRequest")
@Fluent
public final class IaasVmilrRegistrationRequest extends IlrRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IaasVmilrRegistrationRequest.class);

    /*
     * ID of the IaaS VM backup copy from where the files/folders have to be
     * restored.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /*
     * Fully qualified ARM ID of the virtual machine whose the files / folders
     * have to be restored.
     */
    @JsonProperty(value = "virtualMachineId")
    private String virtualMachineId;

    /*
     * iSCSI initiator name.
     */
    @JsonProperty(value = "initiatorName")
    private String initiatorName;

    /*
     * Whether to renew existing registration with the iSCSI server.
     */
    @JsonProperty(value = "renewExistingRegistration")
    private Boolean renewExistingRegistration;

    /**
     * Get the recoveryPointId property: ID of the IaaS VM backup copy from where the files/folders have to be restored.
     *
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: ID of the IaaS VM backup copy from where the files/folders have to be restored.
     *
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the IaasVmilrRegistrationRequest object itself.
     */
    public IaasVmilrRegistrationRequest withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Get the virtualMachineId property: Fully qualified ARM ID of the virtual machine whose the files / folders have
     * to be restored.
     *
     * @return the virtualMachineId value.
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Set the virtualMachineId property: Fully qualified ARM ID of the virtual machine whose the files / folders have
     * to be restored.
     *
     * @param virtualMachineId the virtualMachineId value to set.
     * @return the IaasVmilrRegistrationRequest object itself.
     */
    public IaasVmilrRegistrationRequest withVirtualMachineId(String virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
        return this;
    }

    /**
     * Get the initiatorName property: iSCSI initiator name.
     *
     * @return the initiatorName value.
     */
    public String initiatorName() {
        return this.initiatorName;
    }

    /**
     * Set the initiatorName property: iSCSI initiator name.
     *
     * @param initiatorName the initiatorName value to set.
     * @return the IaasVmilrRegistrationRequest object itself.
     */
    public IaasVmilrRegistrationRequest withInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }

    /**
     * Get the renewExistingRegistration property: Whether to renew existing registration with the iSCSI server.
     *
     * @return the renewExistingRegistration value.
     */
    public Boolean renewExistingRegistration() {
        return this.renewExistingRegistration;
    }

    /**
     * Set the renewExistingRegistration property: Whether to renew existing registration with the iSCSI server.
     *
     * @param renewExistingRegistration the renewExistingRegistration value to set.
     * @return the IaasVmilrRegistrationRequest object itself.
     */
    public IaasVmilrRegistrationRequest withRenewExistingRegistration(Boolean renewExistingRegistration) {
        this.renewExistingRegistration = renewExistingRegistration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
