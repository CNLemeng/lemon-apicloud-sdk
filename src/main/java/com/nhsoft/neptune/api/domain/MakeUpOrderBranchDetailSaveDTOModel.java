package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderBranchDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderBranchDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="4302", required=true)
    private Integer itemNum;
    @ApiCloudField(value="item_lot_number", example="20260101")
    private String itemLotNumber;
    @ApiCloudField(value="item_qty", example="0.5", required=true)
    private BigDecimal itemQty;
    @ApiCloudField(value="item_make_up_price", example="0.5", required=true)
    private BigDecimal itemMakeUpPrice;
    @ApiCloudField(value="item_memo", example="备注")
    private String itemMemo;
}
