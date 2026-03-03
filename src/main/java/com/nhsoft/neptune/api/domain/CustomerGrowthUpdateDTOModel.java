package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerGrowthUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerGrowthUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="customer_id", example="99675000001", required=true)
    private Long customerId;
    @ApiCloudField(value="growth_value", example="10", required=true)
    private Integer growthValue;
}
