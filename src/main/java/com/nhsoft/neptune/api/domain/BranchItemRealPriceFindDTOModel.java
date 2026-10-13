package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemRealPriceFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemRealPriceFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="item_nums")
    private List<Integer> itemNums;
    @ApiCloudField(value="last_edit_time", example="2026-07-28 00:00:00", required=true)
    private String lastEditTime;
}
