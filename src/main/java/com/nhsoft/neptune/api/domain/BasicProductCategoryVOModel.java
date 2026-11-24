package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicProductCategoryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicProductCategoryVOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private Long id;
    @ApiCloudField(value="item_category_id")
    private Long itemCategoryId;
    @ApiCloudField(value="code", example="A0001")
    private String code;
    @ApiCloudField(value="name", example="软饮料")
    private String name;
    @ApiCloudField(value="parent_id")
    private Long parentId;
}
