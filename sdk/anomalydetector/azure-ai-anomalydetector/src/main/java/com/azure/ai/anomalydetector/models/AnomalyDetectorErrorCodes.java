// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AnomalyDetectorErrorCodes. */
public final class AnomalyDetectorErrorCodes extends ExpandableStringEnum<AnomalyDetectorErrorCodes> {
    /** Static value null for AnomalyDetectorErrorCodes. */
    public static final AnomalyDetectorErrorCodes INVALID_CUSTOM_INTERVAL = fromString(null);

    /** Static value null for AnomalyDetectorErrorCodes. */
    public static final AnomalyDetectorErrorCodes BAD_ARGUMENT = fromString(null);

    /** Static value null for AnomalyDetectorErrorCodes. */
    public static final AnomalyDetectorErrorCodes INVALID_GRANULARITY = fromString(null);

    /** Static value null for AnomalyDetectorErrorCodes. */
    public static final AnomalyDetectorErrorCodes INVALID_PERIOD = fromString(null);

    /** Static value null for AnomalyDetectorErrorCodes. */
    public static final AnomalyDetectorErrorCodes INVALID_MODEL_ARGUMENT = fromString(null);

    /** Static value null for AnomalyDetectorErrorCodes. */
    public static final AnomalyDetectorErrorCodes INVALID_SERIES = fromString(null);

    /** Static value null for AnomalyDetectorErrorCodes. */
    public static final AnomalyDetectorErrorCodes INVALID_JSON_FORMAT = fromString(null);

    /** Static value null for AnomalyDetectorErrorCodes. */
    public static final AnomalyDetectorErrorCodes REQUIRED_GRANULARITY = fromString(null);

    /** Static value null for AnomalyDetectorErrorCodes. */
    public static final AnomalyDetectorErrorCodes REQUIRED_SERIES = fromString(null);

    /**
     * Creates or finds a AnomalyDetectorErrorCodes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnomalyDetectorErrorCodes.
     */
    @JsonCreator
    public static AnomalyDetectorErrorCodes fromString(String name) {
        return fromString(name, AnomalyDetectorErrorCodes.class);
    }

    /** @return known AnomalyDetectorErrorCodes values. */
    public static Collection<AnomalyDetectorErrorCodes> values() {
        return values(AnomalyDetectorErrorCodes.class);
    }
}
