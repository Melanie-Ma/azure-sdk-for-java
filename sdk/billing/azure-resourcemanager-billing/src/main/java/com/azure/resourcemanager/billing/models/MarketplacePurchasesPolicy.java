// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MarketplacePurchasesPolicy. */
public final class MarketplacePurchasesPolicy extends ExpandableStringEnum<MarketplacePurchasesPolicy> {
    /** Static value AllAllowed for MarketplacePurchasesPolicy. */
    public static final MarketplacePurchasesPolicy ALL_ALLOWED = fromString("AllAllowed");

    /** Static value OnlyFreeAllowed for MarketplacePurchasesPolicy. */
    public static final MarketplacePurchasesPolicy ONLY_FREE_ALLOWED = fromString("OnlyFreeAllowed");

    /** Static value NotAllowed for MarketplacePurchasesPolicy. */
    public static final MarketplacePurchasesPolicy NOT_ALLOWED = fromString("NotAllowed");

    /**
     * Creates or finds a MarketplacePurchasesPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MarketplacePurchasesPolicy.
     */
    @JsonCreator
    public static MarketplacePurchasesPolicy fromString(String name) {
        return fromString(name, MarketplacePurchasesPolicy.class);
    }

    /** @return known MarketplacePurchasesPolicy values. */
    public static Collection<MarketplacePurchasesPolicy> values() {
        return values(MarketplacePurchasesPolicy.class);
    }
}
