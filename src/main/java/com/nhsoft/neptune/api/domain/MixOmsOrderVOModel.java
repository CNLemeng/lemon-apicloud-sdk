package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsOrderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="ama_store_id")
    private Integer amaStoreId;
    @ApiCloudField(value="buyer_message", example="快速配送")
    private String buyerMessage;
    @ApiCloudField(value="created_at", example="2026-06-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="deliverable", example="true")
    private Boolean deliverable;
    @ApiCloudField(value="display_order_id")
    private String displayOrderId;
    @ApiCloudField(value="fetch_goods_time")
    private String fetchGoodsTime;
    @ApiCloudField(value="id")
    private Integer id;
    @ApiCloudField(value="package_fee")
    private BigDecimal packageFee;
    @ApiCloudField(value="package_num")
    private Integer packageNum;
    @ApiCloudField(value="payment")
    private BigDecimal payment;
    @ApiCloudField(value="platform")
    private Integer platform;
    @ApiCloudField(value="platform_str")
    private String platformStr;
    @ApiCloudField(value="post_fee")
    private BigDecimal postFee;
    @ApiCloudField(value="receiver_address")
    private String receiverAddress;
    @ApiCloudField(value="receiver_name")
    private String receiverName;
    @ApiCloudField(value="receiver_phone")
    private String receiverPhone;
    @ApiCloudField(value="refund_status")
    private Integer refundStatus;
    @ApiCloudField(value="seq")
    private Integer seq;
    @ApiCloudField(value="shipping_type")
    private Integer shippingType;
    @ApiCloudField(value="status")
    private Integer status;
    @ApiCloudField(value="title")
    private String title;
    @ApiCloudField(value="total_fee")
    private BigDecimal totalFee;
    @ApiCloudField(value="order_items")
    private List<MixOmsOrderDetailVOModel> orderItems;
}
