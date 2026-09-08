package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * VipLevelOfflineBenefitsVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipLevelOfflineBenefitsVOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private Long id;
    @ApiCloudField(value="discount_type")
    private String discountType;
    @ApiCloudField(value="discount_without_coupon")
    private Boolean discountWithoutCoupon;
    @ApiCloudField(value="birth_discount")
    private BigDecimal birthDiscount;
    @ApiCloudField(value="price_level")
    private Integer priceLevel;
    @ApiCloudField(value="price_discount")
    private BigDecimal priceDiscount;
    @ApiCloudField(value="payment_types")
    private String paymentTypes;
    @ApiCloudField(value="enable")
    private Boolean enable;
    @ApiCloudField(value="birth_discount_level")
    private Integer birthDiscountLevel;
    @ApiCloudField(value="branch_nums")
    private List<Integer> branchNums;
    @ApiCloudField(value="except_branch_nums")
    private List<Integer> exceptBranchNums;
    @ApiCloudField(value="point_rule")
    private OfflinePointRuleVOModel pointRule;
    @ApiCloudField(value="rank")
    private Integer rank;
    @ApiCloudField(value="level_name")
    private String levelName;
    @ApiCloudField(value="need_pay", example="true")
    private Boolean needPay;
    @ApiCloudField(value="upgrade_by_growth", example="true")
    private Boolean upgradeByGrowth;
    @ApiCloudField(value="growth_value", example="1")
    private Integer growthValue;
}
