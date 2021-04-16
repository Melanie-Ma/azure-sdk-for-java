// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SybaseAuthenticationType. */
public final class SybaseAuthenticationType extends ExpandableStringEnum<SybaseAuthenticationType> {
    /** Static value Basic for SybaseAuthenticationType. */
    public static final SybaseAuthenticationType BASIC = fromString("Basic");

    /** Static value Windows for SybaseAuthenticationType. */
    public static final SybaseAuthenticationType WINDOWS = fromString("Windows");

    /**
     * Creates or finds a SybaseAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SybaseAuthenticationType.
     */
    @JsonCreator
    public static SybaseAuthenticationType fromString(String name) {
        return fromString(name, SybaseAuthenticationType.class);
    }

    /** @return known SybaseAuthenticationType values. */
    public static Collection<SybaseAuthenticationType> values() {
        return values(SybaseAuthenticationType.class);
    }
}
