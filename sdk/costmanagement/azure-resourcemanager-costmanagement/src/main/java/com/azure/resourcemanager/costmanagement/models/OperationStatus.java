// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.resourcemanager.costmanagement.fluent.models.OperationStatusInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of OperationStatus. */
public interface OperationStatus {
    /**
     * Gets the status property: The status of the long running operation.
     *
     * @return the status value.
     */
    Status status();

    /**
     * Gets the reportUrl property: The URL to download the generated report.
     *
     * @return the reportUrl value.
     */
    String reportUrl();

    /**
     * Gets the validUntil property: The time at which report URL becomes invalid.
     *
     * @return the validUntil value.
     */
    OffsetDateTime validUntil();

    /**
     * Gets the inner com.azure.resourcemanager.costmanagement.fluent.models.OperationStatusInner object.
     *
     * @return the inner object.
     */
    OperationStatusInner innerModel();
}
