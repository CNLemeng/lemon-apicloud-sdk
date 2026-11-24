package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseReturnDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseReturnDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", required=true)
    private Integer itemNum;
    @ApiCloudField(value="item_use_qty", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="item_use_price")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="item_use_unit", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="item_qty")
    private BigDecimal itemQty;
    @ApiCloudField(value="item_present_unit")
    private String itemPresentUnit;
    @ApiCloudField(value="item_present_use_qty")
    private BigDecimal itemPresentUseQty;
    @ApiCloudField(value="item_present_qty")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="item_tax_rate")
    private BigDecimal itemTaxRate;
    @ApiCloudField(value="item_transfer_price")
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="item_fee_money")
    private BigDecimal itemFeeMoney;
    @ApiCloudField(value="item_producing_date")
    private String itemProducingDate;
    @ApiCloudField(value="item_lot_number")
    private String itemLotNumber;
    @ApiCloudField(value="item_memo")
    private String itemMemo;
    @ApiCloudField(value="item_lot")
    private ItemLotDTOModel itemLot;
}
