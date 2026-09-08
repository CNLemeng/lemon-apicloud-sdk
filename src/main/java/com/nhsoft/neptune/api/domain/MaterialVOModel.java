package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MaterialVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MaterialVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="9965800000565")
    private Long id;
    @ApiCloudField(value="created_at", example="2026-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="created_by", example="268396")
    private Long createdBy;
    @ApiCloudField(value="deleted_flag", example="true")
    private Boolean deletedFlag;
    @ApiCloudField(value="duration")
    private String duration;
    @ApiCloudField(value="index_id")
    private Long indexId;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="size", example="51957")
    private Long size;
    @ApiCloudField(value="type", example="IMAGE")
    private String type;
    @ApiCloudField(value="updated_at", example="2026-01-01 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="updated_by", example="1")
    private Long updatedBy;
    @ApiCloudField(value="url")
    private String url;
    @ApiCloudField(value="video_url")
    private String videoUrl;
}
