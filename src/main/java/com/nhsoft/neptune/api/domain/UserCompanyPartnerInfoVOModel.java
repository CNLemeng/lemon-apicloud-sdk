package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCompanyPartnerInfoVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCompanyPartnerInfoVOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private Long id;
    @ApiCloudField(value="code")
    private String code;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="category")
    private String category;
    @ApiCloudField(value="type")
    private String type;
    @ApiCloudField(value="enable")
    private Boolean enable;
    @ApiCloudField(value="created_at", example="2026-07-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="updated_at", example="2026-07-01 00:00:00")
    private String updatedAt;
}
