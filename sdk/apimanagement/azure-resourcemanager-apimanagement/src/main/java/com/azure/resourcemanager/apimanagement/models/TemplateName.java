// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TemplateName. */
public final class TemplateName extends ExpandableStringEnum<TemplateName> {
    /** Static value applicationApprovedNotificationMessage for TemplateName. */
    public static final TemplateName APPLICATION_APPROVED_NOTIFICATION_MESSAGE =
        fromString("applicationApprovedNotificationMessage");

    /** Static value accountClosedDeveloper for TemplateName. */
    public static final TemplateName ACCOUNT_CLOSED_DEVELOPER = fromString("accountClosedDeveloper");

    /** Static value quotaLimitApproachingDeveloperNotificationMessage for TemplateName. */
    public static final TemplateName QUOTA_LIMIT_APPROACHING_DEVELOPER_NOTIFICATION_MESSAGE =
        fromString("quotaLimitApproachingDeveloperNotificationMessage");

    /** Static value newDeveloperNotificationMessage for TemplateName. */
    public static final TemplateName NEW_DEVELOPER_NOTIFICATION_MESSAGE = fromString("newDeveloperNotificationMessage");

    /** Static value emailChangeIdentityDefault for TemplateName. */
    public static final TemplateName EMAIL_CHANGE_IDENTITY_DEFAULT = fromString("emailChangeIdentityDefault");

    /** Static value inviteUserNotificationMessage for TemplateName. */
    public static final TemplateName INVITE_USER_NOTIFICATION_MESSAGE = fromString("inviteUserNotificationMessage");

    /** Static value newCommentNotificationMessage for TemplateName. */
    public static final TemplateName NEW_COMMENT_NOTIFICATION_MESSAGE = fromString("newCommentNotificationMessage");

    /** Static value confirmSignUpIdentityDefault for TemplateName. */
    public static final TemplateName CONFIRM_SIGN_UP_IDENTITY_DEFAULT = fromString("confirmSignUpIdentityDefault");

    /** Static value newIssueNotificationMessage for TemplateName. */
    public static final TemplateName NEW_ISSUE_NOTIFICATION_MESSAGE = fromString("newIssueNotificationMessage");

    /** Static value purchaseDeveloperNotificationMessage for TemplateName. */
    public static final TemplateName PURCHASE_DEVELOPER_NOTIFICATION_MESSAGE =
        fromString("purchaseDeveloperNotificationMessage");

    /** Static value passwordResetIdentityDefault for TemplateName. */
    public static final TemplateName PASSWORD_RESET_IDENTITY_DEFAULT = fromString("passwordResetIdentityDefault");

    /** Static value passwordResetByAdminNotificationMessage for TemplateName. */
    public static final TemplateName PASSWORD_RESET_BY_ADMIN_NOTIFICATION_MESSAGE =
        fromString("passwordResetByAdminNotificationMessage");

    /** Static value rejectDeveloperNotificationMessage for TemplateName. */
    public static final TemplateName REJECT_DEVELOPER_NOTIFICATION_MESSAGE =
        fromString("rejectDeveloperNotificationMessage");

    /** Static value requestDeveloperNotificationMessage for TemplateName. */
    public static final TemplateName REQUEST_DEVELOPER_NOTIFICATION_MESSAGE =
        fromString("requestDeveloperNotificationMessage");

    /**
     * Creates or finds a TemplateName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TemplateName.
     */
    @JsonCreator
    public static TemplateName fromString(String name) {
        return fromString(name, TemplateName.class);
    }

    /** @return known TemplateName values. */
    public static Collection<TemplateName> values() {
        return values(TemplateName.class);
    }
}
