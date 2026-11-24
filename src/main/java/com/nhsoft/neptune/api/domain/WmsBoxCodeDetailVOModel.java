package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsBoxCodeDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsBoxCodeDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="item_name")
    private String itemName;
    @ApiCloudField(value="item_code")
    private String itemCode;
    @ApiCloudField(value="lot_num")
    private String lotNum;
    @ApiCloudField(value="base_qty")
    private BigDecimal baseQty;
    @ApiCloudField(value="use_qty")
    private BigDecimal useQty;
    @ApiCloudField(value="base_unit")
    private String baseUnit;
    @ApiCloudField(value="use_unit")
    private String useUnit;
    @ApiCloudField(value="present_use_qty")
    private String presentUseQty;
    @ApiCloudField(value="present_base_qty")
    private String presentBaseQty;
    @ApiCloudField(value="present_use_unit")
    private String presentUseUnit;
    @ApiCloudField(value="box_code")
    private String boxCode;
    @ApiCloudField(value="box_detail_num")
    private Integer boxDetailNum;
}
