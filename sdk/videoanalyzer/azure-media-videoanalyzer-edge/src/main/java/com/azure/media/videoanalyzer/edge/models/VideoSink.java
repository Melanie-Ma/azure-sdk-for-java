// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Video sink allows for video and audio to be recorded to the Video Analyzer service. The recorded video can be played
 * from anywhere and further managed from the cloud. Due to security reasons, a given Video Analyzer edge module
 * instance can only record content to new video entries, or existing video entries previously recorded by the same
 * module. Any attempt to record content to an existing video which has not been created by the same module instance
 * will result in failure to record.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.VideoSink")
@Fluent
public final class VideoSink extends SinkNodeBase {
    /*
     * Name of a new or existing Video Analyzer video resource used for the
     * media recording.
     */
    @JsonProperty(value = "videoName", required = true)
    private String videoName;

    /*
     * Optional video properties to be used in case a new video resource needs
     * to be created on the service.
     */
    @JsonProperty(value = "videoCreationProperties")
    private VideoCreationProperties videoCreationProperties;

    /*
     * Path to a local file system directory for caching of temporary media
     * files. This will also be used to store content which cannot be
     * immediately uploaded to Azure due to Internet connectivity issues.
     */
    @JsonProperty(value = "localMediaCachePath", required = true)
    private String localMediaCachePath;

    /*
     * Maximum amount of disk space that can be used for caching of temporary
     * media files. Once this limit is reached, the oldest segments of the
     * media archive will be continuously deleted in order to make space for
     * new media, thus leading to gaps in the cloud recorded content.
     */
    @JsonProperty(value = "localMediaCacheMaximumSizeMiB", required = true)
    private String localMediaCacheMaximumSizeMiB;

    /**
     * Creates an instance of VideoSink class.
     *
     * @param name the name value to set.
     * @param inputs the inputs value to set.
     * @param videoName the videoName value to set.
     * @param localMediaCachePath the localMediaCachePath value to set.
     * @param localMediaCacheMaximumSizeMiB the localMediaCacheMaximumSizeMiB value to set.
     */
    @JsonCreator
    public VideoSink(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "inputs", required = true) List<NodeInput> inputs,
            @JsonProperty(value = "videoName", required = true) String videoName,
            @JsonProperty(value = "localMediaCachePath", required = true) String localMediaCachePath,
            @JsonProperty(value = "localMediaCacheMaximumSizeMiB", required = true)
                    String localMediaCacheMaximumSizeMiB) {
        super(name, inputs);
        this.videoName = videoName;
        this.localMediaCachePath = localMediaCachePath;
        this.localMediaCacheMaximumSizeMiB = localMediaCacheMaximumSizeMiB;
    }

    /**
     * Get the videoName property: Name of a new or existing Video Analyzer video resource used for the media recording.
     *
     * @return the videoName value.
     */
    public String getVideoName() {
        return this.videoName;
    }

    /**
     * Get the videoCreationProperties property: Optional video properties to be used in case a new video resource needs
     * to be created on the service.
     *
     * @return the videoCreationProperties value.
     */
    public VideoCreationProperties getVideoCreationProperties() {
        return this.videoCreationProperties;
    }

    /**
     * Set the videoCreationProperties property: Optional video properties to be used in case a new video resource needs
     * to be created on the service.
     *
     * @param videoCreationProperties the videoCreationProperties value to set.
     * @return the VideoSink object itself.
     */
    public VideoSink setVideoCreationProperties(VideoCreationProperties videoCreationProperties) {
        this.videoCreationProperties = videoCreationProperties;
        return this;
    }

    /**
     * Get the localMediaCachePath property: Path to a local file system directory for caching of temporary media files.
     * This will also be used to store content which cannot be immediately uploaded to Azure due to Internet
     * connectivity issues.
     *
     * @return the localMediaCachePath value.
     */
    public String getLocalMediaCachePath() {
        return this.localMediaCachePath;
    }

    /**
     * Get the localMediaCacheMaximumSizeMiB property: Maximum amount of disk space that can be used for caching of
     * temporary media files. Once this limit is reached, the oldest segments of the media archive will be continuously
     * deleted in order to make space for new media, thus leading to gaps in the cloud recorded content.
     *
     * @return the localMediaCacheMaximumSizeMiB value.
     */
    public String getLocalMediaCacheMaximumSizeMiB() {
        return this.localMediaCacheMaximumSizeMiB;
    }
}
