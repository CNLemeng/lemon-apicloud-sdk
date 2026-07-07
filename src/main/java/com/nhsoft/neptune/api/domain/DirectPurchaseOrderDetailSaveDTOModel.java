package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseOrderDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseOrderDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="150050001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="item_use_qty", example="1.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="item_use_price", example="1.0", required=true)
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="item_use_unit", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="item_qty", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="item_present_unit", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="item_present_qty", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="item_present_use_qty", example="1.0")
    private BigDecimal itemPresentUseQty;
    @ApiCloudField(value="item_fee_money", example="10.0")
    private BigDecimal itemFeeMoney;
    @ApiCloudField(value="item_transfer_price", example="1.0")
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="item_producing_date", example="2021-01-01")
    private String itemProducingDate;
    @ApiCloudField(value="item_lot_number")
    private String itemLotNumber;
    @ApiCloudField(value="item_memo", example="备注信息")
    private String itemMemo;
}
