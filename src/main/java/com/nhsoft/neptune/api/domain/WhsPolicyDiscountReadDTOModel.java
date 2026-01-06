package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsPolicyDiscountReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsPolicyDiscountReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发折扣单号", example="1099990000003", required=true)
    private String wholesalePolicyDiscountNo;
}
