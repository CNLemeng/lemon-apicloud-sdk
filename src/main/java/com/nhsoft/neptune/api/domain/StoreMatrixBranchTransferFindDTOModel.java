package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixBranchTransferFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixBranchTransferFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_nums", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="item_nums", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="last_update_time", example="2026-01-01 00:00:00")
    private String lastUpdateTime;
}
