package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsOrderSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="platform_order_id", example="MIX2026062300002", required=true)
    private String platformOrderId;
    @ApiCloudField(value="erp_store_id", example="99", required=true)
    private Integer erpStoreId;
    @ApiCloudField(value="shipping_type", example="2")
    private Integer shippingType;
    @ApiCloudField(value="buyer_message", example="快速配送")
    private String buyerMessage;
    @ApiCloudField(value="total_money", example="1000")
    private Integer totalMoney;
    @ApiCloudField(value="discount_money", example="1000")
    private Integer discountMoney;
    @ApiCloudField(value="post_fee_money", example="1000")
    private Integer postFeeMoney;
    @ApiCloudField(value="packaging_fee_money", example="1000")
    private Integer packagingFeeMoney;
    @ApiCloudField(value="package_fee_money", example="1000")
    private Integer packageFeeMoney;
    @ApiCloudField(value="payment_money", example="1000")
    private Integer paymentMoney;
    @ApiCloudField(value="platform_shop_id", example="MIX-SHOP-001")
    private String platformShopId;
    @ApiCloudField(value="store_name", example="海外商城测试门店")
    private String storeName;
    @ApiCloudField(value="store_address", example="上海市测试路1号")
    private String storeAddress;
    @ApiCloudField(value="income", example="1000")
    private Integer income;
    @ApiCloudField(value="receiver_name", example="张三")
    private String receiverName;
    @ApiCloudField(value="receiver_address", example="上海市浦东新区测试地址")
    private String receiverAddress;
    @ApiCloudField(value="receiver_phone", example="13800000000")
    private String receiverPhone;
    @ApiCloudField(value="latitude", example="31.230416")
    private BigDecimal latitude;
    @ApiCloudField(value="longitude", example="121.473701")
    private BigDecimal longitude;
    @ApiCloudField(value="create_time", example="2026-06-01 00:00:00")
    private String createTime;
    @ApiCloudField(value="pay_time", example="2026-06-01 00:00:00")
    private String payTime;
    @ApiCloudField(value="consign_time", example="2026-06-01 00:00:00")
    private String consignTime;
    @ApiCloudField(value="estimate_arrive_time", example="2026-06-01 00:00:00")
    private String estimateArriveTime;
    @ApiCloudField(value="day_seq", example="2")
    private Integer daySeq;
    @ApiCloudField(value="order_item_list", required=true)
    private List<MixOmsOrderDetailSaveDTOModel> orderItemList;
}
