// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;

/** Event data for Microsoft.Devices.DeviceDisconnected event. */
@Immutable
public final class IotHubDeviceDisconnectedEventData extends DeviceConnectionStateEventProperties {
    /** {@inheritDoc} */
    @Override
    public IotHubDeviceDisconnectedEventData setDeviceId(String deviceId) {
        super.setDeviceId(deviceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceDisconnectedEventData setModuleId(String moduleId) {
        super.setModuleId(moduleId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceDisconnectedEventData setHubName(String hubName) {
        super.setHubName(hubName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IotHubDeviceDisconnectedEventData setDeviceConnectionStateEventInfo(
            DeviceConnectionStateEventInfo deviceConnectionStateEventInfo) {
        super.setDeviceConnectionStateEventInfo(deviceConnectionStateEventInfo);
        return this;
    }
}
