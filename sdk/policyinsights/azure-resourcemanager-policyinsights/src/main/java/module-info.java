// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.policyinsights {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.policyinsights;
    exports com.azure.resourcemanager.policyinsights.fluent;
    exports com.azure.resourcemanager.policyinsights.fluent.models;
    exports com.azure.resourcemanager.policyinsights.models;

    opens com.azure.resourcemanager.policyinsights.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.policyinsights.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
