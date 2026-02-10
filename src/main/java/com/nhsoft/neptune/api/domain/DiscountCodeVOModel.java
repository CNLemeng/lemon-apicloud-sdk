package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountCodeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountCodeVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品范围")
    private String discountCodeAssignedType;
    @ApiCloudField(value="商品类别")
    private List<String> discountCodeAssignedCategories;
    @ApiCloudField(value="商品")
    private List<DiscountCodeDetailVOModel> details;
}
