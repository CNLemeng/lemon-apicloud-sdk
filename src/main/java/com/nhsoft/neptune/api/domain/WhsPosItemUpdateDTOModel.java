package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsPosItemUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsPosItemUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="2", required=true)
    private Integer posItemNum;
    @ApiCloudField(value="建议零售价")
    private BigDecimal posItemRegularPrice;
    @ApiCloudField(value="每日订购上限")
    private BigDecimal posItemUpperLimit;
    @ApiCloudField(value="订购倍数")
    private BigDecimal posItemMultiple;
    @ApiCloudField(value="起订数量")
    private BigDecimal posItemOffsetQty;
    @ApiCloudField(value="不允许退货")
    private Boolean unAllowReturn;
    @ApiCloudField(value="在线批发")
    private Boolean itemWholesaleFlag;
    @ApiCloudField(value="禁用批发")
    private Boolean wholesaleForbidden;
}
