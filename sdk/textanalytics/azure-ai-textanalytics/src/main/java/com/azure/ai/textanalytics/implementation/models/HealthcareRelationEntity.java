// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HealthcareRelationEntity model. */
@Fluent
public final class HealthcareRelationEntity {
    /*
     * Reference link object, using a JSON pointer RFC 6901 (URI Fragment
     * Identifier Representation), pointing to the entity .
     */
    @JsonProperty(value = "ref", required = true)
    private String ref;

    /*
     * Role of entity in the relationship. For example: 'CD20-positive diffuse
     * large B-cell lymphoma' has the following entities with their roles in
     * parenthesis:  CD20 (GeneOrProtein), Positive (Expression), diffuse large
     * B-cell lymphoma (Diagnosis).
     */
    @JsonProperty(value = "role", required = true)
    private String role;

    /**
     * Get the ref property: Reference link object, using a JSON pointer RFC 6901 (URI Fragment Identifier
     * Representation), pointing to the entity .
     *
     * @return the ref value.
     */
    public String getRef() {
        return this.ref;
    }

    /**
     * Set the ref property: Reference link object, using a JSON pointer RFC 6901 (URI Fragment Identifier
     * Representation), pointing to the entity .
     *
     * @param ref the ref value to set.
     * @return the HealthcareRelationEntity object itself.
     */
    public HealthcareRelationEntity setRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get the role property: Role of entity in the relationship. For example: 'CD20-positive diffuse large B-cell
     * lymphoma' has the following entities with their roles in parenthesis: CD20 (GeneOrProtein), Positive
     * (Expression), diffuse large B-cell lymphoma (Diagnosis).
     *
     * @return the role value.
     */
    public String getRole() {
        return this.role;
    }

    /**
     * Set the role property: Role of entity in the relationship. For example: 'CD20-positive diffuse large B-cell
     * lymphoma' has the following entities with their roles in parenthesis: CD20 (GeneOrProtein), Positive
     * (Expression), diffuse large B-cell lymphoma (Diagnosis).
     *
     * @param role the role value to set.
     * @return the HealthcareRelationEntity object itself.
     */
    public HealthcareRelationEntity setRole(String role) {
        this.role = role;
        return this;
    }
}
