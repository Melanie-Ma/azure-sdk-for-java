// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.models.DeliveryAttributeMapping;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the Get delivery attributes operation. */
@Fluent
public final class DeliveryAttributeListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeliveryAttributeListResultInner.class);

    /*
     * A collection of DeliveryAttributeMapping
     */
    @JsonProperty(value = "value")
    private List<DeliveryAttributeMapping> value;

    /**
     * Get the value property: A collection of DeliveryAttributeMapping.
     *
     * @return the value value.
     */
    public List<DeliveryAttributeMapping> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of DeliveryAttributeMapping.
     *
     * @param value the value value to set.
     * @return the DeliveryAttributeListResultInner object itself.
     */
    public DeliveryAttributeListResultInner withValue(List<DeliveryAttributeMapping> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
