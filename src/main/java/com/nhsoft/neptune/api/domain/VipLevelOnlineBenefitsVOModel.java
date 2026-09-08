package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * VipLevelOnlineBenefitsVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipLevelOnlineBenefitsVOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private Long id;
    @ApiCloudField(value="level")
    private Integer level;
    @ApiCloudField(value="name", example="V1会员")
    private String name;
    @ApiCloudField(value="discount_rule")
    private OnlineDiscountRuleDTOModel discountRule;
    @ApiCloudField(value="point_rule_id")
    private Long pointRuleId;
    @ApiCloudField(value="point_rule")
    private OnlinePointRuleVOModel pointRule;
}
