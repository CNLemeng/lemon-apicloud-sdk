package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OnlinePointRuleVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OnlinePointRuleVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="417")
    private Long id;
    @ApiCloudField(value="only_card", example="true")
    private Boolean onlyCard;
    @ApiCloudField(value="money", example="1.0")
    private BigDecimal money;
    @ApiCloudField(value="except_variant_ids")
    private List<Long> exceptVariantIds;
    @ApiCloudField(value="updated_at", example="2026-01-01 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="rewarded_point", example="1")
    private Long rewardedPoint;
    @ApiCloudField(value="rule_name", example="线上类别积分")
    private String ruleName;
    @ApiCloudField(value="rule_last_editor", example="admin")
    private String ruleLastEditor;
    @ApiCloudField(value="description")
    private String description;
    @ApiCloudField(value="use_card_type", example="true")
    private Boolean useCardType;
    @ApiCloudField(value="use_variant_point", example="true")
    private Boolean useVariantPoint;
    @ApiCloudField(value="point")
    private Integer point;
    @ApiCloudField(value="category_point_rules")
    private List<OnlineCategoryPointRuleVOModel> categoryPointRules;
}
