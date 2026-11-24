package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsPalletNumberDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsPalletNumberDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="lot_num")
    private String lotNum;
    @ApiCloudField(value="base_qty")
    private BigDecimal baseQty;
    @ApiCloudField(value="use_qty")
    private BigDecimal useQty;
    @ApiCloudField(value="use_rate")
    private BigDecimal useRate;
    @ApiCloudField(value="use_unit")
    private String useUnit;
    @ApiCloudField(value="present_use_qty")
    private String presentUseQty;
    @ApiCloudField(value="present_base_qty")
    private String presentBaseQty;
    @ApiCloudField(value="present_use_unit")
    private String presentUseUnit;
}
