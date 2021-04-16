// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines contents of a web application rule. */
@Fluent
public final class CustomRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomRule.class);

    /*
     * Describes the name of the rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Describes priority of the rule. Rules with a lower value will be
     * evaluated before rules with a higher value.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /*
     * Describes if the custom rule is in enabled or disabled state. Defaults
     * to Enabled if not specified.
     */
    @JsonProperty(value = "enabledState")
    private CustomRuleEnabledState enabledState;

    /*
     * Describes type of rule.
     */
    @JsonProperty(value = "ruleType", required = true)
    private RuleType ruleType;

    /*
     * Time window for resetting the rate limit count. Default is 1 minute.
     */
    @JsonProperty(value = "rateLimitDurationInMinutes")
    private Integer rateLimitDurationInMinutes;

    /*
     * Number of allowed requests per client within the time window.
     */
    @JsonProperty(value = "rateLimitThreshold")
    private Integer rateLimitThreshold;

    /*
     * List of match conditions.
     */
    @JsonProperty(value = "matchConditions", required = true)
    private List<MatchCondition> matchConditions;

    /*
     * Describes what action to be applied when rule matches.
     */
    @JsonProperty(value = "action", required = true)
    private ActionType action;

    /**
     * Get the name property: Describes the name of the rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Describes the name of the rule.
     *
     * @param name the name value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the priority property: Describes priority of the rule. Rules with a lower value will be evaluated before
     * rules with a higher value.
     *
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Describes priority of the rule. Rules with a lower value will be evaluated before
     * rules with a higher value.
     *
     * @param priority the priority value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the enabledState property: Describes if the custom rule is in enabled or disabled state. Defaults to Enabled
     * if not specified.
     *
     * @return the enabledState value.
     */
    public CustomRuleEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Describes if the custom rule is in enabled or disabled state. Defaults to Enabled
     * if not specified.
     *
     * @param enabledState the enabledState value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withEnabledState(CustomRuleEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the ruleType property: Describes type of rule.
     *
     * @return the ruleType value.
     */
    public RuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: Describes type of rule.
     *
     * @param ruleType the ruleType value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withRuleType(RuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the rateLimitDurationInMinutes property: Time window for resetting the rate limit count. Default is 1 minute.
     *
     * @return the rateLimitDurationInMinutes value.
     */
    public Integer rateLimitDurationInMinutes() {
        return this.rateLimitDurationInMinutes;
    }

    /**
     * Set the rateLimitDurationInMinutes property: Time window for resetting the rate limit count. Default is 1 minute.
     *
     * @param rateLimitDurationInMinutes the rateLimitDurationInMinutes value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withRateLimitDurationInMinutes(Integer rateLimitDurationInMinutes) {
        this.rateLimitDurationInMinutes = rateLimitDurationInMinutes;
        return this;
    }

    /**
     * Get the rateLimitThreshold property: Number of allowed requests per client within the time window.
     *
     * @return the rateLimitThreshold value.
     */
    public Integer rateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    /**
     * Set the rateLimitThreshold property: Number of allowed requests per client within the time window.
     *
     * @param rateLimitThreshold the rateLimitThreshold value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withRateLimitThreshold(Integer rateLimitThreshold) {
        this.rateLimitThreshold = rateLimitThreshold;
        return this;
    }

    /**
     * Get the matchConditions property: List of match conditions.
     *
     * @return the matchConditions value.
     */
    public List<MatchCondition> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Set the matchConditions property: List of match conditions.
     *
     * @param matchConditions the matchConditions value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withMatchConditions(List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    /**
     * Get the action property: Describes what action to be applied when rule matches.
     *
     * @return the action value.
     */
    public ActionType action() {
        return this.action;
    }

    /**
     * Set the action property: Describes what action to be applied when rule matches.
     *
     * @param action the action value to set.
     * @return the CustomRule object itself.
     */
    public CustomRule withAction(ActionType action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ruleType in model CustomRule"));
        }
        if (matchConditions() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property matchConditions in model CustomRule"));
        } else {
            matchConditions().forEach(e -> e.validate());
        }
        if (action() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property action in model CustomRule"));
        }
    }
}
