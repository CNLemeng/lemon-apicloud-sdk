package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicProductParamVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicProductParamVOModel extends ApiCloudObject {

    @ApiCloudField(value="是否启用多退少补", example="true")
    private Boolean enableBalance;
    @ApiCloudField(value="包装费类型 NONE 无, FIXED 固定价, NUMBER 按数量,可用值:NONE,FIXED,NUMBER", example="NONE")
    private String packageFeeType;
    @ApiCloudField(value="包装费", example="0.0")
    private BigDecimal packageFee;
    @ApiCloudField(value="运费", example="0.0")
    private BigDecimal trafficFee;
    @ApiCloudField(value="启用会员折扣", example="true")
    private Boolean enableMemberDiscount;
    @ApiCloudField(value="启用促销折扣", example="true")
    private Boolean enablePromotionDiscount;
    @ApiCloudField(value="启用优惠券", example="true")
    private Boolean disableCouponDiscount;
    @ApiCloudField(value="启用到店自提", example="true")
    private Boolean enableSelfPick;
    @ApiCloudField(value="批次开始售卖时间")
    private String saleTimeStart;
    @ApiCloudField(value="批次结束售卖时间")
    private String saleTimeEnd;
    @ApiCloudField(value="批次售卖数量", example="0")
    private Long saleCount;
    @ApiCloudField(value="预售开始时间")
    private String selfPickTime;
    @ApiCloudField(value="预售结束时间")
    private String selfPickTimeEnd;
    @ApiCloudField(value="预售商品未核销/未发货不允许退款", example="true")
    private Boolean disableSelfPickPaidAllowRefund;
    @ApiCloudField(value="售罄后开启预售", example="true")
    private Boolean enableSelloutSelfPick;
    @ApiCloudField(value="预售小时", example="0")
    private Long selfPickHours;
    @ApiCloudField(value="预售天数", example="0")
    private Long selfPickDays;
    @ApiCloudField(value="self_pick_day_time")
    private SettingTimeVOModel selfPickDayTime;
    @ApiCloudField(value="self_pick_separation_time")
    private SettingTimeVOModel selfPickSeparationTime;
    @ApiCloudField(value="预售分段时间点前预售小时", example="1")
    private Long selfPickSeparationTimeBeforeHours;
    @ApiCloudField(value="预售分段时间点后预售小时", example="1")
    private Long selfPickSeparationTimeAfterHours;
    @ApiCloudField(value="self_pick_separation_time_before_day_time")
    private SettingTimeVOModel selfPickSeparationTimeBeforeDayTime;
    @ApiCloudField(value="self_pick_separation_time_after_day_time")
    private SettingTimeVOModel selfPickSeparationTimeAfterDayTime;
    @ApiCloudField(value="预售持续天数", example="1")
    private Long selfPickSupportDays;
    @ApiCloudField(value="启用同城配送", example="true")
    private Boolean enableDelivery;
    @ApiCloudField(value="启用快递", example="true")
    private Boolean enableExpress;
    @ApiCloudField(value="快递模板", example="1")
    private Long expressTemplateId;
    @ApiCloudField(value="是否允许负库存", example="true")
    private Boolean enableNegativeInventory;
    @ApiCloudField(value="装修ID", example="1")
    private Long componentId;
    @ApiCloudField(value="装修显示位置,可用值:TOP,BOTTOM", example="TOP")
    private String componentPosition;
    @ApiCloudField(value="商品限购人群,可用值:NONE,MEMBER,WE_COM", example="NONE")
    private String limitBuyCrowd;
    @ApiCloudField(value="商品限购会员等级", example="")
    private List<LimitBuyCrowdMemberLevelVOModel> limitBuyCrowdMemberLevels;
    @ApiCloudField(value="启用积分抵扣", example="true")
    private Boolean disablePointDeduction;
    @ApiCloudField(value="积分赠送标记", example="true")
    private Boolean disablePointPresent;
    @ApiCloudField(value="同城续重收费", example="true")
    private Boolean enableWeightFee;
    @ApiCloudField(value="规格分组选项", example="")
    private List<ProductSpecGroupVOModel> specGroups;
    @ApiCloudField(value="分享图片", example="")
    private String sharedImage;
}
