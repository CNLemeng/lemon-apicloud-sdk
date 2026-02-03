package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WorkFlowVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkFlowVOModel extends ApiCloudObject {

    @ApiCloudField(value="审批记录编号", example="SP99658202601270000025")
    private String flowInstanceId;
    @ApiCloudField(value="流程流程名称", example="新品申请20260127134932")
    private String flowRelationItemName;
    @ApiCloudField(value="审批状态(1:审批中|6:撤销|8:通过|9:驳回)", example="1")
    private Integer flowStatus;
    @ApiCloudField(value="单据类型(goods_apply:新品申请|adjustment_order:库存调整|price_adjustment:商品调价单)", example="goods_apply")
    private String flowTypeCode;
    @ApiCloudField(value="关联单据号", example="99658A0991000918")
    private String businessId;
    @ApiCloudField(value="跳转地址", example="/setting-center/product-archives/basic-material/new-product-application/edit/")
    private String jumpUrl;
    @ApiCloudField(value="app跳转地址", example="setting-center/new-product-application/edit")
    private String appJumpUrl;
    @ApiCloudField(value="申请人", example="admin")
    private String applicantName;
    @ApiCloudField(value="申请审批时间", example="2026-01-27 17:11:19")
    private String applyTime;
    @ApiCloudField(value="审批人-审批人列表", example="[admin]")
    private List<String> approverNameList;
    @ApiCloudField(value="当前审批人-当前审批节点的人员列表", example="[admin]")
    private List<String> currentApproverNameList;
    @ApiCloudField(value="最近审批时间", example="2026-01-27 17:11:19")
    private String lastApproveTime;
}
