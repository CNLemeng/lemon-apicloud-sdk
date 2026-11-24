package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterApplicationVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterApplicationVOModel extends ApiCloudObject {

    @ApiCloudField(value="app_business_type", example="FUND")
    private String appBusinessType;
    @ApiCloudField(value="app_id")
    private String appId;
    @ApiCloudField(value="app_type")
    private String appType;
    @ApiCloudField(value="created_at", example="2026-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="edition")
    private String edition;
    @ApiCloudField(value="group")
    private String group;
    @ApiCloudField(value="group_v2")
    private String groupV2;
    @ApiCloudField(value="hidden", example="true")
    private Boolean hidden;
    @ApiCloudField(value="modules")
    private List<String> modules;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="new_name")
    private String newName;
    @ApiCloudField(value="position")
    private Integer position;
    @ApiCloudField(value="updated_at", example="2026-01-01 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="url")
    private String url;
}
