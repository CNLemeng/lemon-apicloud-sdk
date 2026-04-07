package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationApplyOrderSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationApplyOrderSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="item_use_unit", example="箱", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="item_use_qty", example="10", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="item_qty", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="item_memo")
    private String itemMemo;
}
