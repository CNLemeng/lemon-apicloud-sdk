package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardTypeCreateDTO模型
 * 创建次卡类型参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardTypeCreateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="次卡类型名称", required=true)
    private String name;
    @ApiCloudField(value="是否启用", required=true)
    private Boolean enable;
    @ApiCloudField(value="卡面背景列表", required=true)
    private List<CardFaceBackgroundModel> cardFaceBackgrounds;
    @ApiCloudField(value="线上商品规格 ID 列表")
    private List<Long> variantIds;
    @ApiCloudField(value="售价，单位元", required=true)
    private BigDecimal sellPrice;
    @ApiCloudField(value="可用次数", required=true)
    private Integer exchangeTime;
    @ApiCloudField(value="每日次数限制，-1 为不限制", required=true)
    private Integer dayExchangeTimeLimit;
    @ApiCloudField(value="有效天数")
    private Integer validDay;
    @ApiCloudField(value="可用渠道：ONLINE 为线上，OFFLINE 为线下", required=true)
    private List<String> channel;
    @ApiCloudField(value="是否允许线上购买", required=true)
    private Boolean allowPurchase;
    @ApiCloudField(value="是否允许线下购买", required=true)
    private Boolean allowOfflinePurchase;
    @ApiCloudField(value="使用须知")
    private String useInstruction;
    @ApiCloudField(value="单次最低兑换次数，-1 为不限制")
    private Integer singleExchangeMinimumTime;
    @ApiCloudField(value="卡面背景字体颜色")
    private String cardFaceBackgroundFontColor;
    @ApiCloudField(value="线上规格可兑换详情")
    private List<VariantDetailModel> variantDetail;
    @ApiCloudField(value="线下商品可兑换详情")
    private List<ItemDetailModel> itemDetail;
    @ApiCloudField(value="线下分级商品可兑换详情")
    private List<ItemGradeDetailModel> itemGradeDetail;
    @ApiCloudField(value="线下商品中心规格可兑换详情，优先于 item_detail 和 item_grade_detail")
    private List<OfflineVariantDetailModel> offlineVariantDetail;
    @ApiCloudField(value="退款设置：NONE 为不允许退款，FULL_REFUND 为允许全额退款，PARTIAL_REFUND 为仅允许部分退款")
    private String refundSetting;
    @ApiCloudField(value="消费结算方式：RATIO 为比例，MONEY 为固定金额")
    private String consumeSettlementMethod;
    @ApiCloudField(value="消费结算金额，单位元")
    private BigDecimal consumeSettlementMoney;
    @ApiCloudField(value="消费结算比例")
    private BigDecimal settlementRatio;
    @ApiCloudField(value="有效期设置：NONE 为自定义，CURRENT_MONTH 为当月有效")
    private String validSetting;
    @ApiCloudField(value="到期是否自动退款")
    private Boolean expireAutoRefund;
    @ApiCloudField(value="过期是否允许线下退款")
    private Boolean expireAllowOfflineRefund;
    @ApiCloudField(value="购买结算比例")
    private BigDecimal purchaseSettlementRatio;
    @ApiCloudField(value="购买开始时间")
    private String purchaseFrom;
    @ApiCloudField(value="购买结束时间")
    private String purchaseTo;
    @ApiCloudField(value="应用门店类型：ALL 为所有门店，SOME 为指定门店")
    private String applyBranchType;
    @ApiCloudField(value="会员中心门店 ID 列表，ALL 时为例外门店，SOME 时为指定门店")
    private List<Integer> branchIds;
    @ApiCloudField(value="划线价，单位元")
    private BigDecimal showPrice;
}
