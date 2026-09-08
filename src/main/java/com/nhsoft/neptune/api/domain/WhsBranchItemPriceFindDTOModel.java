package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsBranchItemPriceFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsBranchItemPriceFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="item_nums", example="[1]")
    private List<Integer> itemNums;
}
