// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Changeable attributes. */
@Fluent
public final class TagWriteableProperties {
    /*
     * Delete enabled
     */
    @JsonProperty(value = "deleteEnabled")
    private Boolean deleteEnabled;

    /*
     * Write enabled
     */
    @JsonProperty(value = "writeEnabled")
    private Boolean writeEnabled;

    /*
     * List enabled
     */
    @JsonProperty(value = "listEnabled")
    private Boolean listEnabled;

    /*
     * Read enabled
     */
    @JsonProperty(value = "readEnabled")
    private Boolean readEnabled;

    /**
     * Get the deleteEnabled property: Delete enabled.
     *
     * @return the deleteEnabled value.
     */
    public Boolean isDeleteEnabled() {
        return this.deleteEnabled;
    }

    /**
     * Set the deleteEnabled property: Delete enabled.
     *
     * @param deleteEnabled the deleteEnabled value to set.
     * @return the TagWriteableProperties object itself.
     */
    public TagWriteableProperties setDeleteEnabled(Boolean deleteEnabled) {
        this.deleteEnabled = deleteEnabled;
        return this;
    }

    /**
     * Get the writeEnabled property: Write enabled.
     *
     * @return the writeEnabled value.
     */
    public Boolean isWriteEnabled() {
        return this.writeEnabled;
    }

    /**
     * Set the writeEnabled property: Write enabled.
     *
     * @param writeEnabled the writeEnabled value to set.
     * @return the TagWriteableProperties object itself.
     */
    public TagWriteableProperties setWriteEnabled(Boolean writeEnabled) {
        this.writeEnabled = writeEnabled;
        return this;
    }

    /**
     * Get the listEnabled property: List enabled.
     *
     * @return the listEnabled value.
     */
    public Boolean isListEnabled() {
        return this.listEnabled;
    }

    /**
     * Set the listEnabled property: List enabled.
     *
     * @param listEnabled the listEnabled value to set.
     * @return the TagWriteableProperties object itself.
     */
    public TagWriteableProperties setListEnabled(Boolean listEnabled) {
        this.listEnabled = listEnabled;
        return this;
    }

    /**
     * Get the readEnabled property: Read enabled.
     *
     * @return the readEnabled value.
     */
    public Boolean isReadEnabled() {
        return this.readEnabled;
    }

    /**
     * Set the readEnabled property: Read enabled.
     *
     * @param readEnabled the readEnabled value to set.
     * @return the TagWriteableProperties object itself.
     */
    public TagWriteableProperties setReadEnabled(Boolean readEnabled) {
        this.readEnabled = readEnabled;
        return this;
    }
}
