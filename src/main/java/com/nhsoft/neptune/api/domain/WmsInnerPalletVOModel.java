package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsInnerPalletVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsInnerPalletVOModel extends ApiCloudObject {

    @ApiCloudField(value="pallet_number", example="RQ998722601290001")
    private String palletNumber;
    @ApiCloudField(value="item_count", example="2")
    private Integer itemCount;
    @ApiCloudField(value="total_qty", example="2.0")
    private BigDecimal totalQty;
    @ApiCloudField(value="box_count", example="2.0")
    private BigDecimal boxCount;
    @ApiCloudField(value="package_count")
    private Integer packageCount;
    @ApiCloudField(value="item_info")
    private List<WmsInnerPalletDetailDTOModel> itemInfo;
}
