package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsInnerPalletDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsInnerPalletDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_code", example="2000013")
    private String itemCode;
    @ApiCloudField(value="item_name", example="10-13可乐")
    private String itemName;
    @ApiCloudField(value="item_unit", example="瓶")
    private String itemUnit;
    @ApiCloudField(value="item_qty", example="2.0")
    private BigDecimal itemQty;
}
