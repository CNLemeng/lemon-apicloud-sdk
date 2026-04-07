package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationApplyOrderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationApplyOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="allocation_apply_order_fid")
    private String allocationApplyOrderFid;
    @ApiCloudField(value="branch_num")
    private Integer branchNum;
    @ApiCloudField(value="branch_name")
    private String branchName;
    @ApiCloudField(value="out_storehouse_num")
    private Integer outStorehouseNum;
    @ApiCloudField(value="out_storehouse_name")
    private String outStorehouseName;
    @ApiCloudField(value="in_storehouse_num")
    private Integer inStorehouseNum;
    @ApiCloudField(value="in_storehouse_name")
    private String inStorehouseName;
    @ApiCloudField(value="allocation_apply_order_date")
    private String allocationApplyOrderDate;
    @ApiCloudField(value="allocation_apply_order_create_time")
    private String allocationApplyOrderCreateTime;
    @ApiCloudField(value="allocation_apply_order_creator")
    private String allocationApplyOrderCreator;
    @ApiCloudField(value="allocation_apply_order_auditor")
    private String allocationApplyOrderAuditor;
    @ApiCloudField(value="allocation_apply_order_audit_time")
    private String allocationApplyOrderAuditTime;
    @ApiCloudField(value="allocation_apply_order_last_editor")
    private String allocationApplyOrderLastEditor;
    @ApiCloudField(value="allocation_apply_order_last_edit_time")
    private String allocationApplyOrderLastEditTime;
    @ApiCloudField(value="allocation_apply_order_money")
    private BigDecimal allocationApplyOrderMoney;
    @ApiCloudField(value="state")
    private StateModel state;
    @ApiCloudField(value="allocation_apply_order_memo")
    private String allocationApplyOrderMemo;
    @ApiCloudField(value="allocation_apply_order_uuid")
    private String allocationApplyOrderUuid;
    @ApiCloudField(value="allocation_apply_order_print_count")
    private Integer allocationApplyOrderPrintCount;
    @ApiCloudField(value="allocation_apply_order_department")
    private String allocationApplyOrderDepartment;
    @ApiCloudField(value="allocation_apply_order_cancel")
    private String allocationApplyOrderCancel;
    @ApiCloudField(value="allocation_apply_order_cancel_time")
    private String allocationApplyOrderCancelTime;
    @ApiCloudField(value="allocation_apply_order_out_state")
    private Integer allocationApplyOrderOutState;
    @ApiCloudField(value="allocation_apply_order_out_state_name")
    private String allocationApplyOrderOutStateName;
    @ApiCloudField(value="allocation_apply_order_details")
    private List<AllocationApplyOrderDetailVOModel> allocationApplyOrderDetails;
    @ApiCloudField(value="allocation_apply_order_operator")
    private String allocationApplyOrderOperator;
}
