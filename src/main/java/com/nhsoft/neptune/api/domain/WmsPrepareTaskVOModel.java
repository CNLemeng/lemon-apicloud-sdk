package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsPrepareTaskVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsPrepareTaskVOModel extends ApiCloudObject {

    @ApiCloudField(value="prepare_task_fid", example="996589926091000001")
    private String prepareTaskFid;
    @ApiCloudField(value="request_summary_fid", example="996589926091000001")
    private String requestSummaryFid;
    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="prepare_task_wms_bizday", example="20260401")
    private String prepareTaskWmsBizday;
    @ApiCloudField(value="prepare_task_create_time", example="2026-01-01 00:00:00")
    private String prepareTaskCreateTime;
    @ApiCloudField(value="prepare_task_creator", example="admin")
    private String prepareTaskCreator;
    @ApiCloudField(value="prepare_task_item_num", example="1")
    private Integer prepareTaskItemNum;
    @ApiCloudField(value="prepare_task_item_code", example="00294")
    private String prepareTaskItemCode;
    @ApiCloudField(value="prepare_task_item_name", example="菠萝蜜肉整个")
    private String prepareTaskItemName;
    @ApiCloudField(value="prepare_task_item_spec")
    private String prepareTaskItemSpec;
    @ApiCloudField(value="item_barcode", example="00708")
    private String itemBarcode;
    @ApiCloudField(value="prepare_task_item_department", example="测试部门")
    private String prepareTaskItemDepartment;
    @ApiCloudField(value="prepare_task_item_cost_mode", example="加权平均法")
    private String prepareTaskItemCostMode;
    @ApiCloudField(value="prepare_task_item_category_code", example="99909162222222")
    private String prepareTaskItemCategoryCode;
    @ApiCloudField(value="prepare_task_item_category_name", example="果蔬")
    private String prepareTaskItemCategoryName;
    @ApiCloudField(value="prepare_task_item_stock_qty", example="100.0")
    private BigDecimal prepareTaskItemStockQty;
    @ApiCloudField(value="prepare_task_item_base_unit", example="箱")
    private String prepareTaskItemBaseUnit;
    @ApiCloudField(value="prepare_task_item_base_qty", example="1.0")
    private BigDecimal prepareTaskItemBaseQty;
    @ApiCloudField(value="prepare_task_item_use_unit", example="箱")
    private String prepareTaskItemUseUnit;
    @ApiCloudField(value="prepare_task_item_plan_use_qty", example="100.0")
    private BigDecimal prepareTaskItemPlanUseQty;
    @ApiCloudField(value="prepare_task_item_real_use_qty", example="100.0")
    private BigDecimal prepareTaskItemRealUseQty;
    @ApiCloudField(value="prepare_task_item_use_rate", example="1.0")
    private BigDecimal prepareTaskItemUseRate;
    @ApiCloudField(value="prepare_task_state_code", example="1")
    private Integer prepareTaskStateCode;
    @ApiCloudField(value="prepare_task_state_name", example="制单")
    private String prepareTaskStateName;
    @ApiCloudField(value="prepare_task_audit_time", example="2026-01-01 00:00:00")
    private String prepareTaskAuditTime;
    @ApiCloudField(value="prepare_task_auditor", example="admin")
    private String prepareTaskAuditor;
    @ApiCloudField(value="item_prepare_stock_ignore", example="true")
    private Boolean itemPrepareStockIgnore;
    @ApiCloudField(value="prepare_task_item_fixed_is", example="true")
    private Boolean prepareTaskItemFixedIs;
    @ApiCloudField(value="summary4_prepare_order_fid", example="996589926091000001")
    private String summary4PrepareOrderFid;
    @ApiCloudField(value="prepare_task_completer", example="admin")
    private String prepareTaskCompleter;
    @ApiCloudField(value="prepare_task_complete_time", example="2026-01-01 00:00:00")
    private String prepareTaskCompleteTime;
    @ApiCloudField(value="prepare_task_period_num")
    private Integer prepareTaskPeriodNum;
    @ApiCloudField(value="prepare_task_period_name")
    private String prepareTaskPeriodName;
    @ApiCloudField(value="wave_num")
    private Long waveNum;
    @ApiCloudField(value="wave_name")
    private String waveName;
    @ApiCloudField(value="purchase_task_fid")
    private String purchaseTaskFid;
    @ApiCloudField(value="prepare_task_purchase_qty", example="100.0")
    private BigDecimal prepareTaskPurchaseQty;
    @ApiCloudField(value="force_allocate", example="true")
    private Boolean forceAllocate;
}
