// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.metricsadvisor;

import com.azure.ai.metricsadvisor.models.ChangePointValue;
import com.azure.ai.metricsadvisor.models.MetricAnomalyFeedback;
import com.azure.ai.metricsadvisor.models.MetricChangePointFeedback;
import com.azure.ai.metricsadvisor.models.MetricCommentFeedback;
import com.azure.ai.metricsadvisor.models.MetricFeedback;
import com.azure.ai.metricsadvisor.models.MetricPeriodFeedback;
import com.azure.ai.metricsadvisor.models.MetricsAdvisorKeyCredential;

import java.time.OffsetDateTime;

import static com.azure.ai.metricsadvisor.models.FeedbackType.ANOMALY;
import static com.azure.ai.metricsadvisor.models.FeedbackType.CHANGE_POINT;
import static com.azure.ai.metricsadvisor.models.FeedbackType.COMMENT;
import static com.azure.ai.metricsadvisor.models.FeedbackType.PERIOD;

/**
 * Sample demonstrates how to create, get and list metric feedbacks.
 */
public class MetricFeedbackOperationsSample {
    public static void main(String[] args) {
        final MetricsAdvisorClient advisorClient =
            new MetricsAdvisorClientBuilder()
                .endpoint("https://{endpoint}.cognitiveservices.azure.com/")
                .credential(new MetricsAdvisorKeyCredential("subscription_key", "api_key"))
                .buildClient();

        // Create Metric Feedback
        final String metricId = "d3gh4i4-b804-4ab9-a70f-0da0c89cft3l";
        final OffsetDateTime startTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
        final OffsetDateTime endTime = OffsetDateTime.parse("2020-09-09T00:00:00Z");
        final MetricChangePointFeedback metricChangePointFeedback
            = new MetricChangePointFeedback(startTime, endTime, ChangePointValue.AUTO_DETECT);

        System.out.printf("Creating Metric Feedback%n");
        final MetricFeedback createdFeedback
            = advisorClient.createMetricFeedback(metricId, metricChangePointFeedback);

        System.out.printf("Created Metric Feedback: %s%n", createdFeedback.getId());

        System.out.printf("Fetching Metric Feedback: %s%n", createdFeedback.getId());

        // Retrieve the metric feedback that just created.
        MetricFeedback fetchFeedback = advisorClient.getMetricFeedback(createdFeedback.getId());
        System.out.printf("Fetched Metric Feedback%n");

        System.out.printf("Metric Feedback Id : %s%n", fetchFeedback.getId());
        System.out.printf("Metric Feedback created time : %s%n", fetchFeedback.getCreatedTime());
        System.out.printf("Metric Feedback user principal : %s%n", fetchFeedback.getUserPrincipal());
        System.out.printf("Metric feedback associated dimension filter: %s%n",
            fetchFeedback.getDimensionFilter().asMap());

        if (CHANGE_POINT.equals(createdFeedback.getFeedbackType())) {
            MetricChangePointFeedback createdMetricChangePointFeedback
                = (MetricChangePointFeedback) createdFeedback;
            System.out.printf("Metric feedback Id: %s%n", createdMetricChangePointFeedback.getId());
            System.out.printf("Metric feedback change point value: %s%n",
                createdMetricChangePointFeedback.getChangePointValue().toString());
            System.out.printf("Metric feedback start time: %s%n",
                createdMetricChangePointFeedback.getStartTime());
            System.out.printf("Metric feedback end time: %s%n",
                createdMetricChangePointFeedback.getEndTime());
        }

        // List metric feedbacks.
        System.out.printf("Listing metric feedbacks%n");
        advisorClient.listMetricFeedbacks(metricId)
            .forEach(feedbackItem -> {
                System.out.printf("Metric Feedback Id : %s%n", feedbackItem.getId());
                System.out.printf("Metric Feedback created time : %s%n", feedbackItem.getCreatedTime());
                System.out.printf("Metric Feedback user principal : %s%n", feedbackItem.getUserPrincipal());
                System.out.printf("Metric feedback associated dimension filter: %s%n",
                    feedbackItem.getDimensionFilter().asMap());

                if (CHANGE_POINT.equals(feedbackItem.getFeedbackType())) {
                    MetricChangePointFeedback changePointFeedback
                        = (MetricChangePointFeedback) feedbackItem;
                    System.out.printf("Metric feedback change point value: %s%n",
                        changePointFeedback.getChangePointValue().toString());
                    System.out.printf("Metric feedback start time: %s%n",
                        changePointFeedback.getStartTime());
                    System.out.printf("Metric feedback end time: %s%n",
                        changePointFeedback.getEndTime());
                } else if (PERIOD.equals(feedbackItem.getFeedbackType())) {
                    MetricPeriodFeedback periodFeedback
                        = (MetricPeriodFeedback) feedbackItem;
                    System.out.printf("Metric feedback type: %s%n",
                        periodFeedback.getPeriodType().toString());
                    System.out.printf("Metric feedback period value: %f%n",
                        periodFeedback.getPeriodValue());
                } else if (ANOMALY.equals(feedbackItem.getFeedbackType())) {
                    MetricAnomalyFeedback metricAnomalyFeedback
                        = (MetricAnomalyFeedback) feedbackItem;
                    System.out.printf("Metric feedback anomaly value: %s%n",
                        metricAnomalyFeedback.getAnomalyValue().toString());
                    System.out.printf("Metric feedback associated detection configuration Id: %s%n",
                        metricAnomalyFeedback.getDetectionConfigurationId());
                } else if (COMMENT.equals(feedbackItem.getFeedbackType())) {
                    MetricCommentFeedback metricCommentFeedback
                        = (MetricCommentFeedback) feedbackItem;
                    System.out.printf("Metric feedback comment value: %s%n",
                        metricCommentFeedback.getComment());
                }
            });
    }
}
