package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OfflinePointRuleVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OfflinePointRuleVOModel extends ApiCloudObject {

    @ApiCloudField(value="rule_id", example="9965801000010")
    private Long ruleId;
    @ApiCloudField(value="rule_name", example="测试卡储值积分")
    private String ruleName;
    @ApiCloudField(value="rule_creator", example="admin")
    private String ruleCreator;
    @ApiCloudField(value="rule_last_editor", example="admin")
    private String ruleLastEditor;
    @ApiCloudField(value="rule_type", example="消费积分")
    private String ruleType;
    @ApiCloudField(value="rule_money", example="1.0")
    private BigDecimal ruleMoney;
    @ApiCloudField(value="rule_value", example="1")
    private Integer ruleValue;
    @ApiCloudField(value="enable_birthday_point", example="true")
    private Boolean enableBirthdayPoint;
    @ApiCloudField(value="discount_item_no_point", example="true")
    private Boolean discountItemNoPoint;
    @ApiCloudField(value="manual_changed_no_point", example="true")
    private Boolean manualChangedNoPoint;
    @ApiCloudField(value="mgr_discount_no_point", example="true")
    private Boolean mgrDiscountNoPoint;
    @ApiCloudField(value="coupon_no_point", example="true")
    private Boolean couponNoPoint;
    @ApiCloudField(value="discount_tags_no_point", example="true")
    private Boolean discountTagsNoPoint;
    @ApiCloudField(value="discount_code_no_point", example="true")
    private Boolean discountCodeNoPoint;
    @ApiCloudField(value="limited_time_code_no_point", example="true")
    private Boolean limitedTimeCodeNoPoint;
    @ApiCloudField(value="category_level", example="1")
    private Integer categoryLevel;
    @ApiCloudField(value="rule_content")
    private String ruleContent;
    @ApiCloudField(value="enable_item_point_flag", example="true")
    private Boolean enableItemPointFlag;
    @ApiCloudField(value="restricted_payment_types")
    private List<String> restrictedPaymentTypes;
    @ApiCloudField(value="payment_types", example="[现金]")
    private List<String> paymentTypes;
    @ApiCloudField(value="rule_description")
    private String ruleDescription;
    @ApiCloudField(value="rule_create_time", example="2026-01-01 00:00:00")
    private String ruleCreateTime;
    @ApiCloudField(value="rule_last_edit_time", example="2026-01-01 00:00:00")
    private String ruleLastEditTime;
}
