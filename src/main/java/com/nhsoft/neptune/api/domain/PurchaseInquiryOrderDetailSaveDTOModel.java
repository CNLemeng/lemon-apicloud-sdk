package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseInquiryOrderDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseInquiryOrderDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="item_use_qty", example="8.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="item_memo", example="N")
    private String itemMemo;
}
