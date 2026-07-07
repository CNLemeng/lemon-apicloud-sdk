package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsFailedOrderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsFailedOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="client_discount_fee", example="1000")
    private Integer clientDiscountFee;
    @ApiCloudField(value="created_at", example="2026-06-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="display_order_id")
    private String displayOrderId;
    @ApiCloudField(value="id")
    private String id;
    @ApiCloudField(value="income", example="1000")
    private Integer income;
    @ApiCloudField(value="mercury_client_id")
    private String mercuryClientId;
    @ApiCloudField(value="package_fee")
    private Integer packageFee;
    @ApiCloudField(value="payment")
    private Integer payment;
    @ApiCloudField(value="platform_discount_fee")
    private Integer platformDiscountFee;
    @ApiCloudField(value="platform_order_id", example="MIX2026062300002")
    private String platformOrderId;
    @ApiCloudField(value="platform_refund_id", example="MIX2026062300002")
    private String platformRefundId;
    @ApiCloudField(value="post_fee")
    private Integer postFee;
    @ApiCloudField(value="push_created_at", example="2026-06-01 00:00:00")
    private String pushCreatedAt;
    @ApiCloudField(value="push_failed_code")
    private Integer pushFailedCode;
    @ApiCloudField(value="push_failed_reason")
    private String pushFailedReason;
    @ApiCloudField(value="push_updated_at", example="2026-06-01 00:00:00")
    private String pushUpdatedAt;
    @ApiCloudField(value="store_id")
    private Integer storeId;
    @ApiCloudField(value="store_name")
    private String storeName;
    @ApiCloudField(value="title")
    private String title;
    @ApiCloudField(value="total_fee")
    private Integer totalFee;
    @ApiCloudField(value="upc")
    private String upc;
    @ApiCloudField(value="discount_infos")
    private List<MixOmsDiscountInfoDTOModel> discountInfos;
    @ApiCloudField(value="order_items")
    private List<MixOmsFailedOrderDetailVOModel> orderItems;
    @ApiCloudField(value="platform")
    private MixOmsDescDTOModel platform;
    @ApiCloudField(value="push_status")
    private MixOmsDescDTOModel pushStatus;
    @ApiCloudField(value="refund_status")
    private MixOmsDescDTOModel refundStatus;
    @ApiCloudField(value="status")
    private MixOmsDescDTOModel status;
}
