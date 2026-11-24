package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchasePriceFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchasePriceFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="item_nums", example="[1]", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="supplier_num", example="9965899901", required=true)
    private Integer supplierNum;
}
