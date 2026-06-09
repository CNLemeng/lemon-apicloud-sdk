package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesalerExtendPropertyVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesalerExtendPropertyVOModel extends ApiCloudObject {

    @ApiCloudField(value="扩展属性id", example="9967500000011")
    private Long id;
    @ApiCloudField(value="扩展属性名称", example="a")
    private String extendedPropertyName;
    @ApiCloudField(value="扩展属性类型", example="TEXT")
    private String extendedPropertyType;
    @ApiCloudField(value="required_flag")
    private Boolean requiredFlag;
    @ApiCloudField(value="排序", example="1")
    private Integer sortNum;
    @ApiCloudField(value="created_at", example="2026-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="updated_at", example="2026-01-01 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="创建人id", example="1")
    private Long createdBy;
    @ApiCloudField(value="更新人id", example="1")
    private Long updatedBy;
    @ApiCloudField(value="是否删除", example="false")
    private Boolean deletedFlag;
}
