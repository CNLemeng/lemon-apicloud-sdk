package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OnlineCategoryPointRuleVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OnlineCategoryPointRuleVOModel extends ApiCloudObject {

    @ApiCloudField(value="category_id", example="1281")
    private Long categoryId;
    @ApiCloudField(value="money", example="10.0")
    private BigDecimal money;
    @ApiCloudField(value="point", example="1")
    private Integer point;
}
