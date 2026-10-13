package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseInquiryOrderDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseInquiryOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="detail_num", example="1")
    private Integer detailNum;
    @ApiCloudField(value="item_num", example="1")
    private Integer itemNum;
    @ApiCloudField(value="item_code", example="99091")
    private String itemCode;
    @ApiCloudField(value="item_name", example="可口可乐（无糖）")
    private String itemName;
    @ApiCloudField(value="item_barcode", example="9990911")
    private String itemBarcode;
    @ApiCloudField(value="item_pinyin", example="KKKLWT")
    private String itemPinyin;
    @ApiCloudField(value="item_qty", example="192.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="item_unit", example="听")
    private String itemUnit;
    @ApiCloudField(value="item_use_unit", example="箱")
    private String itemUseUnit;
    @ApiCloudField(value="item_use_qty", example="8.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="item_use_rate", example="24.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="item_memo", example="B")
    private String itemMemo;
    @ApiCloudField(value="item_spec")
    private String itemSpec;
}
