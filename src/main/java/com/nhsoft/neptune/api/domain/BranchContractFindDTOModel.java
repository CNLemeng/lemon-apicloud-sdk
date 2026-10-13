package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchContractFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchContractFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="date_from", example="2026-09-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-09-20 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="date_type", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="contract_id")
    private Long contractId;
    @ApiCloudField(value="contract_state")
    private Integer contractState;
    @ApiCloudField(value="inner_branch_nums", example="[1]")
    private List<Integer> innerBranchNums;
    @ApiCloudField(value="contract_fid")
    private String contractFid;
    @ApiCloudField(value="contract_collect_type")
    private String contractCollectType;
    @ApiCloudField(value="only_effect")
    private Boolean onlyEffect;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="20", required=true)
    private Integer pageSize;
}
