package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MercuryProductAnalysisVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MercuryProductAnalysisVOModel extends ApiCloudObject {

    @ApiCloudField(value="cart_added_count", example="10")
    private Long cartAddedCount;
    @ApiCloudField(value="cart_added_custom_count", example="10")
    private Long cartAddedCustomCount;
    @ApiCloudField(value="collection_count", example="10")
    private Long collectionCount;
    @ApiCloudField(value="order_convert_rate", example="0.25")
    private BigDecimal orderConvertRate;
    @ApiCloudField(value="order_count", example="10")
    private Long orderCount;
    @ApiCloudField(value="order_custom_count", example="10")
    private Long orderCustomCount;
    @ApiCloudField(value="page_view", example="10")
    private Long pageView;
    @ApiCloudField(value="paid_count", example="10")
    private Long paidCount;
    @ApiCloudField(value="paid_custom_count", example="10")
    private Long paidCustomCount;
    @ApiCloudField(value="paid_money", example="10.0")
    private BigDecimal paidMoney;
    @ApiCloudField(value="paid_order_count", example="10")
    private Long paidOrderCount;
    @ApiCloudField(value="product_id", example="111")
    private Long productId;
    @ApiCloudField(value="product_name", example="可口可乐")
    private String productName;
    @ApiCloudField(value="refund_custom_count", example="10")
    private Long refundCustomCount;
    @ApiCloudField(value="refund_order_count", example="10")
    private Long refundOrderCount;
    @ApiCloudField(value="refunded_count", example="10")
    private Long refundedCount;
    @ApiCloudField(value="refunded_custom_count", example="10")
    private Long refundedCustomCount;
    @ApiCloudField(value="refunded_money", example="10.0")
    private BigDecimal refundedMoney;
    @ApiCloudField(value="refunded_order_count", example="10")
    private Long refundedOrderCount;
    @ApiCloudField(value="refunded_rate", example="0.2")
    private BigDecimal refundedRate;
    @ApiCloudField(value="unique_visitor", example="10")
    private Long uniqueVisitor;
    @ApiCloudField(value="variant", example="可口可乐(箱)")
    private String variant;
    @ApiCloudField(value="variant_code", example="A0001")
    private String variantCode;
    @ApiCloudField(value="variant_id", example="99675001")
    private Long variantId;
    @ApiCloudField(value="view_convert_rate", example="0.25")
    private BigDecimal viewConvertRate;
}
