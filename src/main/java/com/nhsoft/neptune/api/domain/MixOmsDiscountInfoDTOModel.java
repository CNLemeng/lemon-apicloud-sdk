package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsDiscountInfoDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsDiscountInfoDTOModel extends ApiCloudObject {

    @ApiCloudField(value="discount_fee")
    private Integer discountFee;
    @ApiCloudField(value="title")
    private String title;
}
