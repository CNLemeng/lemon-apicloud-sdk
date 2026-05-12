package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderSupplierSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderSupplierSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="30852")
    private Integer itemNum;
    @ApiCloudField(value="item_qty")
    private BigDecimal itemQty;
    @ApiCloudField(value="item_make_up_price")
    private BigDecimal itemMakeUpPrice;
    @ApiCloudField(value="item_make_up_money")
    private BigDecimal itemMakeUpMoney;
    @ApiCloudField(value="make_up_order_detail_memo")
    private String makeUpOrderDetailMemo;
}
