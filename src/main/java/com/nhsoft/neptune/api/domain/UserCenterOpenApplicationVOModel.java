package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterOpenApplicationVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterOpenApplicationVOModel extends ApiCloudObject {

    @ApiCloudField(value="open_app_id")
    private String openAppId;
    @ApiCloudField(value="created_at")
    private String createdAt;
    @ApiCloudField(value="description")
    private String description;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="supplier_url")
    private String supplierUrl;
    @ApiCloudField(value="updated_at")
    private String updatedAt;
    @ApiCloudField(value="url")
    private String url;
}
