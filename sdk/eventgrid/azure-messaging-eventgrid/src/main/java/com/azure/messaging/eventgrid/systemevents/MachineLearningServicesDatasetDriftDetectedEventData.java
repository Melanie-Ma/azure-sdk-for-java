// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.MachineLearningServices.DatasetDriftDetected event.
 */
@Fluent
public final class MachineLearningServicesDatasetDriftDetectedEventData {
    /*
     * The ID of the data drift monitor that triggered the event.
     */
    @JsonProperty(value = "dataDriftId")
    private String dataDriftId;

    /*
     * The name of the data drift monitor that triggered the event.
     */
    @JsonProperty(value = "dataDriftName")
    private String dataDriftName;

    /*
     * The ID of the Run that detected data drift.
     */
    @JsonProperty(value = "runId")
    private String runId;

    /*
     * The ID of the base Dataset used to detect drift.
     */
    @JsonProperty(value = "baseDatasetId")
    private String baseDatasetId;

    /*
     * The ID of the target Dataset used to detect drift.
     */
    @JsonProperty(value = "targetDatasetId")
    private String targetDatasetId;

    /*
     * The coefficient result that triggered the event.
     */
    @JsonProperty(value = "driftCoefficient")
    private Double driftCoefficient;

    /*
     * The start time of the target dataset time series that resulted in drift
     * detection.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time of the target dataset time series that resulted in drift
     * detection.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /**
     * Get the dataDriftId property: The ID of the data drift monitor that triggered the event.
     *
     * @return the dataDriftId value.
     */
    public String getDataDriftId() {
        return this.dataDriftId;
    }

    /**
     * Set the dataDriftId property: The ID of the data drift monitor that triggered the event.
     *
     * @param dataDriftId the dataDriftId value to set.
     * @return the MachineLearningServicesDatasetDriftDetectedEventData object itself.
     */
    public MachineLearningServicesDatasetDriftDetectedEventData setDataDriftId(String dataDriftId) {
        this.dataDriftId = dataDriftId;
        return this;
    }

    /**
     * Get the dataDriftName property: The name of the data drift monitor that triggered the event.
     *
     * @return the dataDriftName value.
     */
    public String getDataDriftName() {
        return this.dataDriftName;
    }

    /**
     * Set the dataDriftName property: The name of the data drift monitor that triggered the event.
     *
     * @param dataDriftName the dataDriftName value to set.
     * @return the MachineLearningServicesDatasetDriftDetectedEventData object itself.
     */
    public MachineLearningServicesDatasetDriftDetectedEventData setDataDriftName(String dataDriftName) {
        this.dataDriftName = dataDriftName;
        return this;
    }

    /**
     * Get the runId property: The ID of the Run that detected data drift.
     *
     * @return the runId value.
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * Set the runId property: The ID of the Run that detected data drift.
     *
     * @param runId the runId value to set.
     * @return the MachineLearningServicesDatasetDriftDetectedEventData object itself.
     */
    public MachineLearningServicesDatasetDriftDetectedEventData setRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the baseDatasetId property: The ID of the base Dataset used to detect drift.
     *
     * @return the baseDatasetId value.
     */
    public String getBaseDatasetId() {
        return this.baseDatasetId;
    }

    /**
     * Set the baseDatasetId property: The ID of the base Dataset used to detect drift.
     *
     * @param baseDatasetId the baseDatasetId value to set.
     * @return the MachineLearningServicesDatasetDriftDetectedEventData object itself.
     */
    public MachineLearningServicesDatasetDriftDetectedEventData setBaseDatasetId(String baseDatasetId) {
        this.baseDatasetId = baseDatasetId;
        return this;
    }

    /**
     * Get the targetDatasetId property: The ID of the target Dataset used to detect drift.
     *
     * @return the targetDatasetId value.
     */
    public String getTargetDatasetId() {
        return this.targetDatasetId;
    }

    /**
     * Set the targetDatasetId property: The ID of the target Dataset used to detect drift.
     *
     * @param targetDatasetId the targetDatasetId value to set.
     * @return the MachineLearningServicesDatasetDriftDetectedEventData object itself.
     */
    public MachineLearningServicesDatasetDriftDetectedEventData setTargetDatasetId(String targetDatasetId) {
        this.targetDatasetId = targetDatasetId;
        return this;
    }

    /**
     * Get the driftCoefficient property: The coefficient result that triggered the event.
     *
     * @return the driftCoefficient value.
     */
    public Double getDriftCoefficient() {
        return this.driftCoefficient;
    }

    /**
     * Set the driftCoefficient property: The coefficient result that triggered the event.
     *
     * @param driftCoefficient the driftCoefficient value to set.
     * @return the MachineLearningServicesDatasetDriftDetectedEventData object itself.
     */
    public MachineLearningServicesDatasetDriftDetectedEventData setDriftCoefficient(Double driftCoefficient) {
        this.driftCoefficient = driftCoefficient;
        return this;
    }

    /**
     * Get the startTime property: The start time of the target dataset time series that resulted in drift detection.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the target dataset time series that resulted in drift detection.
     *
     * @param startTime the startTime value to set.
     * @return the MachineLearningServicesDatasetDriftDetectedEventData object itself.
     */
    public MachineLearningServicesDatasetDriftDetectedEventData setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the target dataset time series that resulted in drift detection.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the target dataset time series that resulted in drift detection.
     *
     * @param endTime the endTime value to set.
     * @return the MachineLearningServicesDatasetDriftDetectedEventData object itself.
     */
    public MachineLearningServicesDatasetDriftDetectedEventData setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }
}
