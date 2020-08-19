// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RedisCreateProperties model. */
@Fluent
public class RedisCreateProperties extends RedisCommonProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisCreateProperties.class);

    /*
     * The SKU of the Redis cache to deploy.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * The full resource ID of a subnet in a virtual network to deploy the
     * Redis cache in. Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /*
     * Static IP address. Required when deploying a Redis cache inside an
     * existing Azure Virtual Network.
     */
    @JsonProperty(value = "staticIP")
    private String staticIp;

    /**
     * Get the sku property: The SKU of the Redis cache to deploy.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the Redis cache to deploy.
     *
     * @param sku the sku value to set.
     * @return the RedisCreateProperties object itself.
     */
    public RedisCreateProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @param subnetId the subnetId value to set.
     * @return the RedisCreateProperties object itself.
     */
    public RedisCreateProperties withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the staticIp property: Static IP address. Required when deploying a Redis cache inside an existing Azure
     * Virtual Network.
     *
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.staticIp;
    }

    /**
     * Set the staticIp property: Static IP address. Required when deploying a Redis cache inside an existing Azure
     * Virtual Network.
     *
     * @param staticIp the staticIp value to set.
     * @return the RedisCreateProperties object itself.
     */
    public RedisCreateProperties withStaticIp(String staticIp) {
        this.staticIp = staticIp;
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
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model RedisCreateProperties"));
        } else {
            sku().validate();
        }
    }
}