// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.fluent.LocationsClient;
import com.azure.resourcemanager.videoanalyzer.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.videoanalyzer.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.videoanalyzer.models.CheckNameAvailabilityResponse;
import com.azure.resourcemanager.videoanalyzer.models.Locations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LocationsImpl implements Locations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocationsImpl.class);

    private final LocationsClient innerClient;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public LocationsImpl(
        LocationsClient innerClient, com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameAvailabilityResponse checkNameAvailability(
        String locationName, CheckNameAvailabilityRequest parameters) {
        CheckNameAvailabilityResponseInner inner = this.serviceClient().checkNameAvailability(locationName, parameters);
        if (inner != null) {
            return new CheckNameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResponse> checkNameAvailabilityWithResponse(
        String locationName, CheckNameAvailabilityRequest parameters, Context context) {
        Response<CheckNameAvailabilityResponseInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(locationName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }
}
