// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountAgreementInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of IntegrationAccountAgreement. */
public interface IntegrationAccountAgreement {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the createdTime property: The created time.
     *
     * @return the createdTime value.
     */
    OffsetDateTime createdTime();

    /**
     * Gets the changedTime property: The changed time.
     *
     * @return the changedTime value.
     */
    OffsetDateTime changedTime();

    /**
     * Gets the metadata property: The metadata.
     *
     * @return the metadata value.
     */
    Object metadata();

    /**
     * Gets the agreementType property: The agreement type.
     *
     * @return the agreementType value.
     */
    AgreementType agreementType();

    /**
     * Gets the hostPartner property: The integration account partner that is set as host partner for this agreement.
     *
     * @return the hostPartner value.
     */
    String hostPartner();

    /**
     * Gets the guestPartner property: The integration account partner that is set as guest partner for this agreement.
     *
     * @return the guestPartner value.
     */
    String guestPartner();

    /**
     * Gets the hostIdentity property: The business identity of the host partner.
     *
     * @return the hostIdentity value.
     */
    BusinessIdentity hostIdentity();

    /**
     * Gets the guestIdentity property: The business identity of the guest partner.
     *
     * @return the guestIdentity value.
     */
    BusinessIdentity guestIdentity();

    /**
     * Gets the content property: The agreement content.
     *
     * @return the content value.
     */
    AgreementContent content();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.logic.fluent.models.IntegrationAccountAgreementInner object.
     *
     * @return the inner object.
     */
    IntegrationAccountAgreementInner innerModel();

    /** The entirety of the IntegrationAccountAgreement definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithAgreementType,
            DefinitionStages.WithHostPartner,
            DefinitionStages.WithGuestPartner,
            DefinitionStages.WithHostIdentity,
            DefinitionStages.WithGuestIdentity,
            DefinitionStages.WithContent,
            DefinitionStages.WithCreate {
    }
    /** The IntegrationAccountAgreement definition stages. */
    interface DefinitionStages {
        /** The first stage of the IntegrationAccountAgreement definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, integrationAccountName.
             *
             * @param resourceGroupName The resource group name.
             * @param integrationAccountName The integration account name.
             * @return the next definition stage.
             */
            WithAgreementType withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName);
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify agreementType. */
        interface WithAgreementType {
            /**
             * Specifies the agreementType property: The agreement type..
             *
             * @param agreementType The agreement type.
             * @return the next definition stage.
             */
            WithHostPartner withAgreementType(AgreementType agreementType);
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify hostPartner. */
        interface WithHostPartner {
            /**
             * Specifies the hostPartner property: The integration account partner that is set as host partner for this
             * agreement..
             *
             * @param hostPartner The integration account partner that is set as host partner for this agreement.
             * @return the next definition stage.
             */
            WithGuestPartner withHostPartner(String hostPartner);
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify guestPartner. */
        interface WithGuestPartner {
            /**
             * Specifies the guestPartner property: The integration account partner that is set as guest partner for
             * this agreement..
             *
             * @param guestPartner The integration account partner that is set as guest partner for this agreement.
             * @return the next definition stage.
             */
            WithHostIdentity withGuestPartner(String guestPartner);
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify hostIdentity. */
        interface WithHostIdentity {
            /**
             * Specifies the hostIdentity property: The business identity of the host partner..
             *
             * @param hostIdentity The business identity of the host partner.
             * @return the next definition stage.
             */
            WithGuestIdentity withHostIdentity(BusinessIdentity hostIdentity);
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify guestIdentity. */
        interface WithGuestIdentity {
            /**
             * Specifies the guestIdentity property: The business identity of the guest partner..
             *
             * @param guestIdentity The business identity of the guest partner.
             * @return the next definition stage.
             */
            WithContent withGuestIdentity(BusinessIdentity guestIdentity);
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify content. */
        interface WithContent {
            /**
             * Specifies the content property: The agreement content..
             *
             * @param content The agreement content.
             * @return the next definition stage.
             */
            WithCreate withContent(AgreementContent content);
        }
        /**
         * The stage of the IntegrationAccountAgreement definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithMetadata {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            IntegrationAccountAgreement create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IntegrationAccountAgreement create(Context context);
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the IntegrationAccountAgreement definition allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The metadata..
             *
             * @param metadata The metadata.
             * @return the next definition stage.
             */
            WithCreate withMetadata(Object metadata);
        }
    }
    /**
     * Begins update for the IntegrationAccountAgreement resource.
     *
     * @return the stage of resource update.
     */
    IntegrationAccountAgreement.Update update();

    /** The template for IntegrationAccountAgreement update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithMetadata,
            UpdateStages.WithAgreementType,
            UpdateStages.WithHostPartner,
            UpdateStages.WithGuestPartner,
            UpdateStages.WithHostIdentity,
            UpdateStages.WithGuestIdentity,
            UpdateStages.WithContent {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        IntegrationAccountAgreement apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IntegrationAccountAgreement apply(Context context);
    }
    /** The IntegrationAccountAgreement update stages. */
    interface UpdateStages {
        /** The stage of the IntegrationAccountAgreement update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the IntegrationAccountAgreement update allowing to specify metadata. */
        interface WithMetadata {
            /**
             * Specifies the metadata property: The metadata..
             *
             * @param metadata The metadata.
             * @return the next definition stage.
             */
            Update withMetadata(Object metadata);
        }
        /** The stage of the IntegrationAccountAgreement update allowing to specify agreementType. */
        interface WithAgreementType {
            /**
             * Specifies the agreementType property: The agreement type..
             *
             * @param agreementType The agreement type.
             * @return the next definition stage.
             */
            Update withAgreementType(AgreementType agreementType);
        }
        /** The stage of the IntegrationAccountAgreement update allowing to specify hostPartner. */
        interface WithHostPartner {
            /**
             * Specifies the hostPartner property: The integration account partner that is set as host partner for this
             * agreement..
             *
             * @param hostPartner The integration account partner that is set as host partner for this agreement.
             * @return the next definition stage.
             */
            Update withHostPartner(String hostPartner);
        }
        /** The stage of the IntegrationAccountAgreement update allowing to specify guestPartner. */
        interface WithGuestPartner {
            /**
             * Specifies the guestPartner property: The integration account partner that is set as guest partner for
             * this agreement..
             *
             * @param guestPartner The integration account partner that is set as guest partner for this agreement.
             * @return the next definition stage.
             */
            Update withGuestPartner(String guestPartner);
        }
        /** The stage of the IntegrationAccountAgreement update allowing to specify hostIdentity. */
        interface WithHostIdentity {
            /**
             * Specifies the hostIdentity property: The business identity of the host partner..
             *
             * @param hostIdentity The business identity of the host partner.
             * @return the next definition stage.
             */
            Update withHostIdentity(BusinessIdentity hostIdentity);
        }
        /** The stage of the IntegrationAccountAgreement update allowing to specify guestIdentity. */
        interface WithGuestIdentity {
            /**
             * Specifies the guestIdentity property: The business identity of the guest partner..
             *
             * @param guestIdentity The business identity of the guest partner.
             * @return the next definition stage.
             */
            Update withGuestIdentity(BusinessIdentity guestIdentity);
        }
        /** The stage of the IntegrationAccountAgreement update allowing to specify content. */
        interface WithContent {
            /**
             * Specifies the content property: The agreement content..
             *
             * @param content The agreement content.
             * @return the next definition stage.
             */
            Update withContent(AgreementContent content);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    IntegrationAccountAgreement refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IntegrationAccountAgreement refresh(Context context);

    /**
     * Get the content callback url.
     *
     * @param listContentCallbackUrl The callback url parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url.
     */
    WorkflowTriggerCallbackUrl listContentCallbackUrl(GetCallbackUrlParameters listContentCallbackUrl);

    /**
     * Get the content callback url.
     *
     * @param listContentCallbackUrl The callback url parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url.
     */
    Response<WorkflowTriggerCallbackUrl> listContentCallbackUrlWithResponse(
        GetCallbackUrlParameters listContentCallbackUrl, Context context);
}
