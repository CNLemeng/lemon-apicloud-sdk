package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * VipLevelVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipLevelVOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private Long id;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="rank")
    private Integer rank;
    @ApiCloudField(value="need_pay")
    private Boolean needPay;
    @ApiCloudField(value="state", example="DISABLED")
    private String state;
    @ApiCloudField(value="fixed", example="true")
    private Boolean fixed;
    @ApiCloudField(value="supplementary_card_global_switch", example="true")
    private Boolean supplementaryCardGlobalSwitch;
    @ApiCloudField(value="upgrade_by_growth", example="true")
    private Boolean upgradeByGrowth;
    @ApiCloudField(value="growth_value", example="2")
    private Integer growthValue;
    @ApiCloudField(value="growth_valid_type", example="DAY")
    private String growthValidType;
    @ApiCloudField(value="growth_valid_value", example="1")
    private Integer growthValidValue;
    @ApiCloudField(value="reduce_growth_value", example="2")
    private Integer reduceGrowthValue;
    @ApiCloudField(value="count_member", example="0")
    private Integer countMember;
    @ApiCloudField(value="count_record", example="0")
    private Integer countRecord;
    @ApiCloudField(value="categories")
    private List<CardCategoriedVOModel> categories;
    @ApiCloudField(value="price")
    private PriceConfigVOModel price;
    @ApiCloudField(value="discount")
    private DiscountConfigVOModel discount;
    @ApiCloudField(value="customer_count")
    private Integer customerCount;
    @ApiCloudField(value="purchase_channel")
    private String purchaseChannel;
    @ApiCloudField(value="purchase_refund_type")
    private String purchaseRefundType;
    @ApiCloudField(value="re_purchase_date_type")
    private String rePurchaseDateType;
    @ApiCloudField(value="re_purchase_value")
    private Integer rePurchaseValue;
    @ApiCloudField(value="re_purchase")
    private Boolean rePurchase;
    @ApiCloudField(value="allow_refund_day")
    private String allowRefundDay;
    @ApiCloudField(value="keep_grown_level")
    private Boolean keepGrownLevel;
    @ApiCloudField(value="keep_consume_money")
    private BigDecimal keepConsumeMoney;
    @ApiCloudField(value="discount_type")
    private String discountType;
    @ApiCloudField(value="price_level")
    private Integer priceLevel;
    @ApiCloudField(value="price_discount")
    private BigDecimal priceDiscount;
    @ApiCloudField(value="birth_discount")
    private BigDecimal birthDiscount;
    @ApiCloudField(value="birth_discount_level")
    private Integer birthDiscountLevel;
    @ApiCloudField(value="memo")
    private String memo;
    @ApiCloudField(value="invalid_coupon")
    private Boolean invalidCoupon;
    @ApiCloudField(value="custom_protocol")
    private String customProtocol;
    @ApiCloudField(value="coercive_agreement_enable")
    private Boolean coerciveAgreementEnable;
    @ApiCloudField(value="custom_protocol_version")
    private String customProtocolVersion;
    @ApiCloudField(value="custom_description")
    private String customDescription;
    @ApiCloudField(value="custom_paid_background")
    private String customPaidBackground;
    @ApiCloudField(value="custom_identity_background")
    private String customIdentityBackground;
    @ApiCloudField(value="back_ground_param")
    private BackGroundParamModel backGroundParam;
    @ApiCloudField(value="show_level")
    private Boolean showLevel;
    @ApiCloudField(value="employee_outreaches")
    private List<String> employeeOutreaches;
}
