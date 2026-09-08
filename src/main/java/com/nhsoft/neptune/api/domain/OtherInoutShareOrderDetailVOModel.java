package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OtherInoutShareOrderDetailVO模型
 * 费用分摊单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OtherInoutShareOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="share_order_fid", example="OS992608270001")
    private String shareOrderFid;
    @ApiCloudField(value="share_order_detail_num", example="1")
    private Integer shareOrderDetailNum;
    @ApiCloudField(value="item_num", example="5127")
    private Integer itemNum;
    @ApiCloudField(value="order_fid", example="AO202608270001")
    private String orderFid;
    @ApiCloudField(value="order_detail_num", example="1")
    private Integer orderDetailNum;
    @ApiCloudField(value="inventory_amount", example="10")
    private BigDecimal inventoryAmount;
    @ApiCloudField(value="inventory_cost", example="8.0")
    private BigDecimal inventoryCost;
    @ApiCloudField(value="detail_share_money", example="100.0")
    private BigDecimal detailShareMoney;
    @ApiCloudField(value="adjustment_inventory_cost", example="18.0")
    private BigDecimal adjustmentInventoryCost;
    @ApiCloudField(value="item_code", example="ITEM-5127")
    private String itemCode;
    @ApiCloudField(value="item_name", example="示例商品")
    private String itemName;
    @ApiCloudField(value="item_unit", example="件")
    private String itemUnit;
    @ApiCloudField(value="item_spec", example="1件")
    private String itemSpec;
    @ApiCloudField(value="item_barcode", example="6900000005127")
    private String itemBarcode;
    @ApiCloudField(value="order_amount", example="10")
    private BigDecimal orderAmount;
    @ApiCloudField(value="order_use_amount", example="10")
    private BigDecimal orderUseAmount;
    @ApiCloudField(value="order_money", example="80.0")
    private BigDecimal orderMoney;
    @ApiCloudField(value="item_lot_lot_number", example="LOT20260827")
    private String itemLotLotNumber;
    @ApiCloudField(value="item_product_date", example="2026-08-27 00:00:00")
    private String itemProductDate;
    @ApiCloudField(value="item_use_unit", example="箱")
    private String itemUseUnit;
    @ApiCloudField(value="item_type", example="1")
    private Integer itemType;
    @ApiCloudField(value="lot_number", example="LOT20260827")
    private String lotNumber;
}
