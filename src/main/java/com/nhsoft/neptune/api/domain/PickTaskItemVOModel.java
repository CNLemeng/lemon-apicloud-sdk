package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PickTaskItemVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PickTaskItemVOModel extends ApiCloudObject {

    @ApiCloudField(value="pick_task_item_num")
    private Integer pickTaskItemNum;
    @ApiCloudField(value="pick_task_item_name")
    private String pickTaskItemName;
    @ApiCloudField(value="pick_task_item_spec")
    private String pickTaskItemSpec;
    @ApiCloudField(value="pick_task_item_code")
    private String pickTaskItemCode;
    @ApiCloudField(value="pick_task_item_department")
    private String pickTaskItemDepartment;
    @ApiCloudField(value="pick_task_item_cost_mode")
    private String pickTaskItemCostMode;
    @ApiCloudField(value="pick_task_item_category_code")
    private String pickTaskItemCategoryCode;
    @ApiCloudField(value="pick_task_item_category_name")
    private String pickTaskItemCategoryName;
    @ApiCloudField(value="pick_task_item_base_unit")
    private String pickTaskItemBaseUnit;
    @ApiCloudField(value="pick_task_item_use_unit")
    private String pickTaskItemUseUnit;
    @ApiCloudField(value="state_name")
    private String stateName;
    @ApiCloudField(value="differences_rate")
    private BigDecimal differencesRate;
    @ApiCloudField(value="plan_use_qty")
    private BigDecimal planUseQty;
    @ApiCloudField(value="real_use_qty")
    private BigDecimal realUseQty;
    @ApiCloudField(value="real_base_qty")
    private BigDecimal realBaseQty;
    @ApiCloudField(value="diff_use_qty")
    private BigDecimal diffUseQty;
    @ApiCloudField(value="pick_task_detail_driver_complete_state")
    private String pickTaskDetailDriverCompleteState;
}
