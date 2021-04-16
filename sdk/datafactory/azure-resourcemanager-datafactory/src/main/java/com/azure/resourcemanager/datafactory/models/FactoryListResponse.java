// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.FactoryInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of factory resources. */
@Fluent
public final class FactoryListResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FactoryListResponse.class);

    /*
     * List of factories.
     */
    @JsonProperty(value = "value", required = true)
    private List<FactoryInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of factories.
     *
     * @return the value value.
     */
    public List<FactoryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of factories.
     *
     * @param value the value value to set.
     * @return the FactoryListResponse object itself.
     */
    public FactoryListResponse withValue(List<FactoryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @param nextLink the nextLink value to set.
     * @return the FactoryListResponse object itself.
     */
    public FactoryListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model FactoryListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
