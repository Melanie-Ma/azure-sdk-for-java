/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about rollback on failed VM instances after a OS Upgrade
 * operation.
 */
public class RollbackStatusInfo {
    /**
     * The number of instances which have been successfully rolled back.
     */
    @JsonProperty(value = "successfullyRolledbackInstanceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer successfullyRolledbackInstanceCount;

    /**
     * The number of instances which failed to rollback.
     */
    @JsonProperty(value = "failedRolledbackInstanceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedRolledbackInstanceCount;

    /**
     * Error details if OS rollback failed.
     */
    @JsonProperty(value = "rollbackError", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError rollbackError;

    /**
     * Get the number of instances which have been successfully rolled back.
     *
     * @return the successfullyRolledbackInstanceCount value
     */
    public Integer successfullyRolledbackInstanceCount() {
        return this.successfullyRolledbackInstanceCount;
    }

    /**
     * Get the number of instances which failed to rollback.
     *
     * @return the failedRolledbackInstanceCount value
     */
    public Integer failedRolledbackInstanceCount() {
        return this.failedRolledbackInstanceCount;
    }

    /**
     * Get error details if OS rollback failed.
     *
     * @return the rollbackError value
     */
    public ApiError rollbackError() {
        return this.rollbackError;
    }

}
