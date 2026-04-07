package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationApplyOrderSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationApplyOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="out_storehouse_num", example="99675000001", required=true)
    private Integer outStorehouseNum;
    @ApiCloudField(value="in_storehouse_num", example="99675000002", required=true)
    private Integer inStorehouseNum;
    @ApiCloudField(value="allocation_apply_order_date", example="2026-01-01 00:00:00", required=true)
    private String allocationApplyOrderDate;
    @ApiCloudField(value="allocation_apply_order_money", example="100.0")
    private BigDecimal allocationApplyOrderMoney;
    @ApiCloudField(value="allocation_apply_order_memo", example="测试")
    private String allocationApplyOrderMemo;
    @ApiCloudField(value="allocation_apply_order_uuid", example="1234567890")
    private String allocationApplyOrderUuid;
    @ApiCloudField(value="allocation_apply_order_details", required=true)
    private List<AllocationApplyOrderSaveDetailDTOModel> allocationApplyOrderDetails;
    @ApiCloudField(value="allocation_apply_order_operator", example="admin", required=true)
    private String allocationApplyOrderOperator;
    @ApiCloudField(value="app_user_num")
    private Integer appUserNum;
}
