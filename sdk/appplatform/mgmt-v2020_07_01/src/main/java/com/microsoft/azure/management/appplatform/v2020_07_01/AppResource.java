/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appplatform.v2020_07_01.implementation.AppResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appplatform.v2020_07_01.implementation.AppPlatformManager;

/**
 * Type representing AppResource.
 */
public interface AppResource extends HasInner<AppResourceInner>, Indexable, Updatable<AppResource.Update>, HasManager<AppPlatformManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    ManagedIdentityProperties identity();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    AppResourceProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the AppResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AppResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AppResource definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the appresource definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the appresource definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the Service resource
            * @return the next definition stage
            */
            WithCreate withServiceName(String serviceName);
        }

        /**
         * The stage of the appresource definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The Managed Identity type of the app resource
             * @return the next definition stage
             */
            WithCreate withIdentity(ManagedIdentityProperties identity);
        }

        /**
         * The stage of the appresource definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The GEO location of the application, always the same with its parent resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the appresource definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Properties of the App resource
             * @return the next definition stage
             */
            WithCreate withProperties(AppResourceProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AppResource>, DefinitionStages.WithIdentity, DefinitionStages.WithLocation, DefinitionStages.WithProperties {
        }
    }
    /**
     * The template for a AppResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AppResource>, UpdateStages.WithIdentity, UpdateStages.WithLocation, UpdateStages.WithProperties {
    }

    /**
     * Grouping of AppResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the appresource update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The Managed Identity type of the app resource
             * @return the next update stage
             */
            Update withIdentity(ManagedIdentityProperties identity);
        }

        /**
         * The stage of the appresource update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The GEO location of the application, always the same with its parent resource
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the appresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Properties of the App resource
             * @return the next update stage
             */
            Update withProperties(AppResourceProperties properties);
        }

    }
}
