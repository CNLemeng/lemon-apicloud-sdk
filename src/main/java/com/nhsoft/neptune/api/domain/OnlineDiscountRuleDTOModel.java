package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OnlineDiscountRuleDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OnlineDiscountRuleDTOModel extends ApiCloudObject {

    @ApiCloudField(value="price_level")
    private Integer priceLevel;
    @ApiCloudField(value="discount_rate")
    private BigDecimal discountRate;
    @ApiCloudField(value="branch_ids")
    private List<Long> branchIds;
    @ApiCloudField(value="except_branch_ids")
    private List<Long> exceptBranchIds;
}
