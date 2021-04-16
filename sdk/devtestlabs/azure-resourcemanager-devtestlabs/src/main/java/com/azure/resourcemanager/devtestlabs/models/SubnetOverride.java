// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Property overrides on a subnet of a virtual network. */
@Fluent
public final class SubnetOverride {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubnetOverride.class);

    /*
     * The resource ID of the subnet.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The name given to the subnet within the lab.
     */
    @JsonProperty(value = "labSubnetName")
    private String labSubnetName;

    /*
     * Indicates whether this subnet can be used during virtual machine
     * creation (i.e. Allow, Deny).
     */
    @JsonProperty(value = "useInVmCreationPermission")
    private UsagePermissionType useInVmCreationPermission;

    /*
     * Indicates whether public IP addresses can be assigned to virtual
     * machines on this subnet (i.e. Allow, Deny).
     */
    @JsonProperty(value = "usePublicIpAddressPermission")
    private UsagePermissionType usePublicIpAddressPermission;

    /*
     * Properties that virtual machines on this subnet will share.
     */
    @JsonProperty(value = "sharedPublicIpAddressConfiguration")
    private SubnetSharedPublicIpAddressConfiguration sharedPublicIpAddressConfiguration;

    /*
     * The virtual network pool associated with this subnet.
     */
    @JsonProperty(value = "virtualNetworkPoolName")
    private String virtualNetworkPoolName;

    /**
     * Get the resourceId property: The resource ID of the subnet.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource ID of the subnet.
     *
     * @param resourceId the resourceId value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the labSubnetName property: The name given to the subnet within the lab.
     *
     * @return the labSubnetName value.
     */
    public String labSubnetName() {
        return this.labSubnetName;
    }

    /**
     * Set the labSubnetName property: The name given to the subnet within the lab.
     *
     * @param labSubnetName the labSubnetName value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withLabSubnetName(String labSubnetName) {
        this.labSubnetName = labSubnetName;
        return this;
    }

    /**
     * Get the useInVmCreationPermission property: Indicates whether this subnet can be used during virtual machine
     * creation (i.e. Allow, Deny).
     *
     * @return the useInVmCreationPermission value.
     */
    public UsagePermissionType useInVmCreationPermission() {
        return this.useInVmCreationPermission;
    }

    /**
     * Set the useInVmCreationPermission property: Indicates whether this subnet can be used during virtual machine
     * creation (i.e. Allow, Deny).
     *
     * @param useInVmCreationPermission the useInVmCreationPermission value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withUseInVmCreationPermission(UsagePermissionType useInVmCreationPermission) {
        this.useInVmCreationPermission = useInVmCreationPermission;
        return this;
    }

    /**
     * Get the usePublicIpAddressPermission property: Indicates whether public IP addresses can be assigned to virtual
     * machines on this subnet (i.e. Allow, Deny).
     *
     * @return the usePublicIpAddressPermission value.
     */
    public UsagePermissionType usePublicIpAddressPermission() {
        return this.usePublicIpAddressPermission;
    }

    /**
     * Set the usePublicIpAddressPermission property: Indicates whether public IP addresses can be assigned to virtual
     * machines on this subnet (i.e. Allow, Deny).
     *
     * @param usePublicIpAddressPermission the usePublicIpAddressPermission value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withUsePublicIpAddressPermission(UsagePermissionType usePublicIpAddressPermission) {
        this.usePublicIpAddressPermission = usePublicIpAddressPermission;
        return this;
    }

    /**
     * Get the sharedPublicIpAddressConfiguration property: Properties that virtual machines on this subnet will share.
     *
     * @return the sharedPublicIpAddressConfiguration value.
     */
    public SubnetSharedPublicIpAddressConfiguration sharedPublicIpAddressConfiguration() {
        return this.sharedPublicIpAddressConfiguration;
    }

    /**
     * Set the sharedPublicIpAddressConfiguration property: Properties that virtual machines on this subnet will share.
     *
     * @param sharedPublicIpAddressConfiguration the sharedPublicIpAddressConfiguration value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withSharedPublicIpAddressConfiguration(
        SubnetSharedPublicIpAddressConfiguration sharedPublicIpAddressConfiguration) {
        this.sharedPublicIpAddressConfiguration = sharedPublicIpAddressConfiguration;
        return this;
    }

    /**
     * Get the virtualNetworkPoolName property: The virtual network pool associated with this subnet.
     *
     * @return the virtualNetworkPoolName value.
     */
    public String virtualNetworkPoolName() {
        return this.virtualNetworkPoolName;
    }

    /**
     * Set the virtualNetworkPoolName property: The virtual network pool associated with this subnet.
     *
     * @param virtualNetworkPoolName the virtualNetworkPoolName value to set.
     * @return the SubnetOverride object itself.
     */
    public SubnetOverride withVirtualNetworkPoolName(String virtualNetworkPoolName) {
        this.virtualNetworkPoolName = virtualNetworkPoolName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sharedPublicIpAddressConfiguration() != null) {
            sharedPublicIpAddressConfiguration().validate();
        }
    }
}
