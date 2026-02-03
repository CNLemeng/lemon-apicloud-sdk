package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WorkFlowApprovalDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkFlowApprovalDTOModel extends ApiCloudObject {

    @ApiCloudField(value="审批用户编号(对应用户中心的company_user_id)", example="1", required=true)
    private Long approverId;
    @ApiCloudField(value="审批记录编号列表", example="[SP99658202601270000025]", required=true)
    private List<String> instanceIdList;
    @ApiCloudField(value="审批类型(APPROVE:审批通过|REJECT:审批驳回)", example="APPROVE", required=true)
    private String approveType;
    @ApiCloudField(value="审批消息")
    private String message;
}
