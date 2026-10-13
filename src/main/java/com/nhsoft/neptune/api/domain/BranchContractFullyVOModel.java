package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchContractFullyVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchContractFullyVOModel extends ApiCloudObject {

    @ApiCloudField(value="contract_id", example="9965801000028")
    private Long contractId;
    @ApiCloudField(value="inner_branch_num", example="1")
    private Integer innerBranchNum;
    @ApiCloudField(value="contract_date_from", example="2026-09-03 00:00:00")
    private String contractDateFrom;
    @ApiCloudField(value="contract_date_to", example="2026-09-03 23:00:00")
    private String contractDateTo;
    @ApiCloudField(value="contract_state", example="1")
    private Integer contractState;
    @ApiCloudField(value="contract_state_name", example="制单|审核")
    private String contractStateName;
    @ApiCloudField(value="contract_creator", example="admin")
    private String contractCreator;
    @ApiCloudField(value="contract_create_time", example="2026-09-03 23:00:00")
    private String contractCreateTime;
    @ApiCloudField(value="contract_auditor", example="admin")
    private String contractAuditor;
    @ApiCloudField(value="contract_audit_time", example="2026-09-03 23:00:00")
    private String contractAuditTime;
    @ApiCloudField(value="contract_last_edit_time", example="2026-09-03 23:00:00")
    private String contractLastEditTime;
    @ApiCloudField(value="contract_last_editor", example="admin")
    private String contractLastEditor;
    @ApiCloudField(value="contract_memo", example="测试")
    private String contractMemo;
    @ApiCloudField(value="contract_fid")
    private String contractFid;
    @ApiCloudField(value="contract_collect_time_type", example="按天")
    private String contractCollectTimeType;
    @ApiCloudField(value="contract_specified_date")
    private Integer contractSpecifiedDate;
    @ApiCloudField(value="settlement_branch_num", example="99")
    private Integer settlementBranchNum;
    @ApiCloudField(value="contract_collect_type", example="调入金额")
    private String contractCollectType;
    @ApiCloudField(value="fee_item_name", example="运费")
    private String feeItemName;
    @ApiCloudField(value="details")
    private List<BranchContractDetailModel> details;
    @ApiCloudField(value="preferential_params")
    private List<PreferentialParamModel> preferentialParams;
}
