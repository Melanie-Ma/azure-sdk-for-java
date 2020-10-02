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
 * Encryption at rest settings for disk or snapshot.
 */
public class Encryption {
    /**
     * ResourceId of the disk encryption set to use for enabling encryption at
     * rest.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /**
     * Possible values include: 'EncryptionAtRestWithPlatformKey',
     * 'EncryptionAtRestWithCustomerKey',
     * 'EncryptionAtRestWithPlatformAndCustomerKeys'.
     */
    @JsonProperty(value = "type")
    private EncryptionType type;

    /**
     * Get resourceId of the disk encryption set to use for enabling encryption at rest.
     *
     * @return the diskEncryptionSetId value
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set resourceId of the disk encryption set to use for enabling encryption at rest.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set
     * @return the Encryption object itself.
     */
    public Encryption withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        return this;
    }

    /**
     * Get possible values include: 'EncryptionAtRestWithPlatformKey', 'EncryptionAtRestWithCustomerKey', 'EncryptionAtRestWithPlatformAndCustomerKeys'.
     *
     * @return the type value
     */
    public EncryptionType type() {
        return this.type;
    }

    /**
     * Set possible values include: 'EncryptionAtRestWithPlatformKey', 'EncryptionAtRestWithCustomerKey', 'EncryptionAtRestWithPlatformAndCustomerKeys'.
     *
     * @param type the type value to set
     * @return the Encryption object itself.
     */
    public Encryption withType(EncryptionType type) {
        this.type = type;
        return this;
    }

}
