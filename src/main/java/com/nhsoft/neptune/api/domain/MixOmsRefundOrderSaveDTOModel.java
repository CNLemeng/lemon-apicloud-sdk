package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsRefundOrderSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsRefundOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="allow_only_refund_after_verified", example="true")
    private Boolean allowOnlyRefundAfterVerified;
    @ApiCloudField(value="current_refund_order_id")
    private String currentRefundOrderId;
    @ApiCloudField(value="origin_platform_order_id")
    private String originPlatformOrderId;
    @ApiCloudField(value="refund_money")
    private String refundMoney;
    @ApiCloudField(value="refund_package_fee_money")
    private String refundPackageFeeMoney;
    @ApiCloudField(value="refund_packaging_fee_money")
    private String refundPackagingFeeMoney;
    @ApiCloudField(value="refund_post_fee_money")
    private String refundPostFeeMoney;
    @ApiCloudField(value="refund_reason")
    private String refundReason;
    @ApiCloudField(value="refund_type")
    private String refundType;
    @ApiCloudField(value="order_item_list")
    private List<MixOmsOrderDetailSaveDTOModel> orderItemList;
}
