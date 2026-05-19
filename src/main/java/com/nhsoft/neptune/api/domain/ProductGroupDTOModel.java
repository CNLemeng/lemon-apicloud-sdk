package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProductGroupDTO模型
 * 仅读取接口返回
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductGroupDTOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private Long id;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="icon")
    private String icon;
    @ApiCloudField(value="parent_id")
    private Long parentId;
    @ApiCloudField(value="default_flag")
    private Boolean defaultFlag;
    @ApiCloudField(value="created_at")
    private String createdAt;
    @ApiCloudField(value="serial_num")
    private Integer serialNum;
    @ApiCloudField(value="product_count")
    private Long productCount;
    @ApiCloudField(value="visible_flag")
    private Boolean visibleFlag;
    @ApiCloudField(value="search_flag")
    private Boolean searchFlag;
    @ApiCloudField(value="category")
    private Boolean category;
}
