// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SelectionMarkState. */
public final class SelectionMarkState extends ExpandableStringEnum<SelectionMarkState> {
    /** Static value selected for SelectionMarkState. */
    public static final SelectionMarkState SELECTED = fromString("selected");

    /** Static value unselected for SelectionMarkState. */
    public static final SelectionMarkState UNSELECTED = fromString("unselected");

    /**
     * Creates or finds a SelectionMarkState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SelectionMarkState.
     */
    @JsonCreator
    public static SelectionMarkState fromString(String name) {
        return fromString(name, SelectionMarkState.class);
    }

    /** @return known SelectionMarkState values. */
    public static Collection<SelectionMarkState> values() {
        return values(SelectionMarkState.class);
    }
}
