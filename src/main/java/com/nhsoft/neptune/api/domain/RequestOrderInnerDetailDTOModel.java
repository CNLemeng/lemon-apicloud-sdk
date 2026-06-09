package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderInnerDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderInnerDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="item_qty")
    private BigDecimal itemQty;
    @ApiCloudField(value="item_use_qty")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="item_use_rate")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="item_use_unit")
    private String itemUseUnit;
    @ApiCloudField(value="item_std_use_qty")
    private BigDecimal itemStdUseQty;
}
