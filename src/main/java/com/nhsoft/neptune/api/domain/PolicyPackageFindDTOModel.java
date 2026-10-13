package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="date_type", example="促销时间", required=true)
    private String dateType;
    @ApiCloudField(value="date_from", example="2026-09-21 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-09-22 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="branch_nums", example="[1]")
    private List<Integer> branchNums;
    @ApiCloudField(value="apply_branch_nums", example="[99]")
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="state_code", example="1")
    private Integer stateCode;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="200", required=true)
    private Integer pageSize;
}
