// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.models.OperationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list Logic operations. It contains a list of operations and a URL link to get the next set
 * of results.
 */
@Fluent
public final class OperationListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationListResult.class);

    /*
     * List of Logic operations supported by the Logic resource provider.
     */
    @JsonProperty(value = "value")
    private List<OperationInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Logic operations supported by the Logic resource provider.
     *
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Logic operations supported by the Logic resource provider.
     *
     * @param value the value value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
