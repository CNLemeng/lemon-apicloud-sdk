package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchasePriceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchasePriceVOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="item_num", example="1")
    private Integer itemNum;
    @ApiCloudField(value="std_price", example="20.0")
    private BigDecimal stdPrice;
}
