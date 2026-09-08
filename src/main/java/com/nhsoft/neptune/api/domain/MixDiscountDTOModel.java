package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixDiscountDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixDiscountDTOModel extends ApiCloudObject {

    @ApiCloudField(value="discount_money", example="100")
    private Integer discountMoney;
    @ApiCloudField(value="discount_name", example="打包一口价")
    private String discountName;
}
