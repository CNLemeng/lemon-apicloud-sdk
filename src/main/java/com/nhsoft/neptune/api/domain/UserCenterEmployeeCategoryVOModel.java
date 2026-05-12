package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserCenterEmployeeCategoryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserCenterEmployeeCategoryVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="996750001")
    private Long id;
    @ApiCloudField(value="code", example="A0001")
    private String code;
    @ApiCloudField(value="parent_id", example="996750001")
    private Long parentId;
    @ApiCloudField(value="name", example="员工类别名称")
    private String name;
    @ApiCloudField(value="created_at", example="2026-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="updated_at", example="2026-01-01 00:00:00")
    private String updatedAt;
}
