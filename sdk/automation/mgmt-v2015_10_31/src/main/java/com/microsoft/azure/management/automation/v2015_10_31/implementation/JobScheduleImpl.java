/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.JobSchedule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.JobScheduleCreateParameters;
import java.util.Map;
import java.util.UUID;
import com.microsoft.azure.management.automation.v2015_10_31.RunbookAssociationProperty;
import com.microsoft.azure.management.automation.v2015_10_31.ScheduleAssociationProperty;
import rx.functions.Func1;

class JobScheduleImpl extends CreatableUpdatableImpl<JobSchedule, JobScheduleInner, JobScheduleImpl> implements JobSchedule, JobSchedule.Definition, JobSchedule.Update {
    private final AutomationManager manager;
    private String resourceGroupName;
    private String automationAccountName;
    private UUID jobScheduleId;
    private JobScheduleCreateParameters createOrUpdateParameter;

    JobScheduleImpl(String name, AutomationManager manager) {
        super(name, new JobScheduleInner());
        this.manager = manager;
        // Set resource name
        this.jobScheduleId = UUID.fromString(name);
        //
        this.createOrUpdateParameter = new JobScheduleCreateParameters();
    }

    JobScheduleImpl(JobScheduleInner inner, AutomationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.automationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "automationAccounts");
        this.jobScheduleId = UUID.fromString(IdParsingUtils.getValueFromIdByName(inner.id(), "jobSchedules"));
        //
        this.createOrUpdateParameter = new JobScheduleCreateParameters();
    }

    @Override
    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<JobSchedule> createResourceAsync() {
        JobSchedulesInner client = this.manager().inner().jobSchedules();
        return client.createAsync(this.resourceGroupName, this.automationAccountName, this.jobScheduleId, this.createOrUpdateParameter)
            .map(new Func1<JobScheduleInner, JobScheduleInner>() {
               @Override
               public JobScheduleInner call(JobScheduleInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<JobSchedule> updateResourceAsync() {
        JobSchedulesInner client = this.manager().inner().jobSchedules();
        return client.createAsync(this.resourceGroupName, this.automationAccountName, this.jobScheduleId, this.createOrUpdateParameter)
            .map(new Func1<JobScheduleInner, JobScheduleInner>() {
               @Override
               public JobScheduleInner call(JobScheduleInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<JobScheduleInner> getInnerAsync() {
        JobSchedulesInner client = this.manager().inner().jobSchedules();
        return client.getAsync(this.resourceGroupName, this.automationAccountName, this.jobScheduleId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new JobScheduleCreateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String jobScheduleId() {
        return this.inner().jobScheduleId();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> parameters() {
        return this.inner().parameters();
    }

    @Override
    public RunbookAssociationProperty runbook() {
        return this.inner().runbook();
    }

    @Override
    public String runOn() {
        return this.inner().runOn();
    }

    @Override
    public ScheduleAssociationProperty schedule() {
        return this.inner().schedule();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public JobScheduleImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    @Override
    public JobScheduleImpl withRunbook(RunbookAssociationProperty runbook) {
        this.createOrUpdateParameter.withRunbook(runbook);
        return this;
    }

    @Override
    public JobScheduleImpl withSchedule(ScheduleAssociationProperty schedule) {
        this.createOrUpdateParameter.withSchedule(schedule);
        return this;
    }

    @Override
    public JobScheduleImpl withParameters(Map<String, String> parameters) {
        this.createOrUpdateParameter.withParameters(parameters);
        return this;
    }

    @Override
    public JobScheduleImpl withRunOn(String runOn) {
        this.createOrUpdateParameter.withRunOn(runOn);
        return this;
    }

}
