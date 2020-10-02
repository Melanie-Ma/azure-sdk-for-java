// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON object that contains the properties required to create an endpoint. */
@Fluent
public final class EndpointProperties extends EndpointPropertiesUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EndpointProperties.class);

    /*
     * The host name of the endpoint structured as {endpointName}.{DNSZone},
     * e.g. contoso.azureedge.net
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The source of the content being delivered via CDN.
     */
    @JsonProperty(value = "origins", required = true)
    private List<DeepCreatedOrigin> origins;

    /*
     * Resource status of the endpoint.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private EndpointResourceState resourceState;

    /*
     * Provisioning status of the endpoint.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the hostname property: The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g.
     * contoso.azureedge.net.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the origins property: The source of the content being delivered via CDN.
     *
     * @return the origins value.
     */
    public List<DeepCreatedOrigin> origins() {
        return this.origins;
    }

    /**
     * Set the origins property: The source of the content being delivered via CDN.
     *
     * @param origins the origins value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withOrigins(List<DeepCreatedOrigin> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * Get the resourceState property: Resource status of the endpoint.
     *
     * @return the resourceState value.
     */
    public EndpointResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState property: Provisioning status of the endpoint.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (origins() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property origins in model EndpointProperties"));
        } else {
            origins().forEach(e -> e.validate());
        }
    }
}
