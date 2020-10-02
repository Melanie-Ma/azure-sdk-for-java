// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The SeriesResult model. */
@Fluent
public final class SeriesResult {
    /*
     * The series property.
     */
    @JsonProperty(value = "series", required = true)
    private SeriesIdentity series;

    /*
     * timestamps of the series
     */
    @JsonProperty(value = "timestampList", required = true)
    private List<OffsetDateTime> timestampList;

    /*
     * values of the series
     */
    @JsonProperty(value = "valueList", required = true)
    private List<Double> valueList;

    /*
     * whether points of the series are anomalies
     */
    @JsonProperty(value = "isAnomalyList", required = true)
    private List<Boolean> isAnomalyList;

    /*
     * period calculated on each point of the series
     */
    @JsonProperty(value = "periodList", required = true)
    private List<Integer> periodList;

    /*
     * expected values of the series given by smart detector
     */
    @JsonProperty(value = "expectedValueList", required = true)
    private List<Double> expectedValueList;

    /*
     * lower boundary list of the series given by smart detector
     */
    @JsonProperty(value = "lowerBoundaryList", required = true)
    private List<Double> lowerBoundaryList;

    /*
     * upper boundary list of the series given by smart detector
     */
    @JsonProperty(value = "upperBoundaryList", required = true)
    private List<Double> upperBoundaryList;

    /**
     * Get the series property: The series property.
     *
     * @return the series value.
     */
    public SeriesIdentity getSeries() {
        return this.series;
    }

    /**
     * Set the series property: The series property.
     *
     * @param series the series value to set.
     * @return the SeriesResult object itself.
     */
    public SeriesResult setSeries(SeriesIdentity series) {
        this.series = series;
        return this;
    }

    /**
     * Get the timestampList property: timestamps of the series.
     *
     * @return the timestampList value.
     */
    public List<OffsetDateTime> getTimestampList() {
        return this.timestampList;
    }

    /**
     * Set the timestampList property: timestamps of the series.
     *
     * @param timestampList the timestampList value to set.
     * @return the SeriesResult object itself.
     */
    public SeriesResult setTimestampList(List<OffsetDateTime> timestampList) {
        this.timestampList = timestampList;
        return this;
    }

    /**
     * Get the valueList property: values of the series.
     *
     * @return the valueList value.
     */
    public List<Double> getValueList() {
        return this.valueList;
    }

    /**
     * Set the valueList property: values of the series.
     *
     * @param valueList the valueList value to set.
     * @return the SeriesResult object itself.
     */
    public SeriesResult setValueList(List<Double> valueList) {
        this.valueList = valueList;
        return this;
    }

    /**
     * Get the isAnomalyList property: whether points of the series are anomalies.
     *
     * @return the isAnomalyList value.
     */
    public List<Boolean> getIsAnomalyList() {
        return this.isAnomalyList;
    }

    /**
     * Set the isAnomalyList property: whether points of the series are anomalies.
     *
     * @param isAnomalyList the isAnomalyList value to set.
     * @return the SeriesResult object itself.
     */
    public SeriesResult setIsAnomalyList(List<Boolean> isAnomalyList) {
        this.isAnomalyList = isAnomalyList;
        return this;
    }

    /**
     * Get the periodList property: period calculated on each point of the series.
     *
     * @return the periodList value.
     */
    public List<Integer> getPeriodList() {
        return this.periodList;
    }

    /**
     * Set the periodList property: period calculated on each point of the series.
     *
     * @param periodList the periodList value to set.
     * @return the SeriesResult object itself.
     */
    public SeriesResult setPeriodList(List<Integer> periodList) {
        this.periodList = periodList;
        return this;
    }

    /**
     * Get the expectedValueList property: expected values of the series given by smart detector.
     *
     * @return the expectedValueList value.
     */
    public List<Double> getExpectedValueList() {
        return this.expectedValueList;
    }

    /**
     * Set the expectedValueList property: expected values of the series given by smart detector.
     *
     * @param expectedValueList the expectedValueList value to set.
     * @return the SeriesResult object itself.
     */
    public SeriesResult setExpectedValueList(List<Double> expectedValueList) {
        this.expectedValueList = expectedValueList;
        return this;
    }

    /**
     * Get the lowerBoundaryList property: lower boundary list of the series given by smart detector.
     *
     * @return the lowerBoundaryList value.
     */
    public List<Double> getLowerBoundaryList() {
        return this.lowerBoundaryList;
    }

    /**
     * Set the lowerBoundaryList property: lower boundary list of the series given by smart detector.
     *
     * @param lowerBoundaryList the lowerBoundaryList value to set.
     * @return the SeriesResult object itself.
     */
    public SeriesResult setLowerBoundaryList(List<Double> lowerBoundaryList) {
        this.lowerBoundaryList = lowerBoundaryList;
        return this;
    }

    /**
     * Get the upperBoundaryList property: upper boundary list of the series given by smart detector.
     *
     * @return the upperBoundaryList value.
     */
    public List<Double> getUpperBoundaryList() {
        return this.upperBoundaryList;
    }

    /**
     * Set the upperBoundaryList property: upper boundary list of the series given by smart detector.
     *
     * @param upperBoundaryList the upperBoundaryList value to set.
     * @return the SeriesResult object itself.
     */
    public SeriesResult setUpperBoundaryList(List<Double> upperBoundaryList) {
        this.upperBoundaryList = upperBoundaryList;
        return this;
    }
}
