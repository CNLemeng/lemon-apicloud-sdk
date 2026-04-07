package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationApplyOrderDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationApplyOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="allocation_apply_order_fid")
    private String allocationApplyOrderFid;
    @ApiCloudField(value="allocation_apply_order_detail_num")
    private Integer allocationApplyOrderDetailNum;
    @ApiCloudField(value="system_book_code")
    private String systemBookCode;
    @ApiCloudField(value="branch_num")
    private Integer branchNum;
    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
    @ApiCloudField(value="allocation_apply_order_detail_item_code")
    private String allocationApplyOrderDetailItemCode;
    @ApiCloudField(value="allocation_apply_order_detail_item_name")
    private String allocationApplyOrderDetailItemName;
    @ApiCloudField(value="allocation_apply_order_detail_item_unit")
    private String allocationApplyOrderDetailItemUnit;
    @ApiCloudField(value="allocation_apply_order_detail_item_spec")
    private String allocationApplyOrderDetailItemSpec;
    @ApiCloudField(value="allocation_apply_order_detail_use_unit")
    private String allocationApplyOrderDetailUseUnit;
    @ApiCloudField(value="allocation_apply_order_detail_qty")
    private BigDecimal allocationApplyOrderDetailQty;
    @ApiCloudField(value="allocation_apply_order_detail_use_qty")
    private BigDecimal allocationApplyOrderDetailUseQty;
    @ApiCloudField(value="allocation_apply_order_detail_price")
    private BigDecimal allocationApplyOrderDetailPrice;
    @ApiCloudField(value="allocation_apply_order_detail_use_price")
    private BigDecimal allocationApplyOrderDetailUsePrice;
    @ApiCloudField(value="allocation_apply_order_detail_money")
    private BigDecimal allocationApplyOrderDetailMoney;
    @ApiCloudField(value="allocation_apply_order_detail_use_rate")
    private BigDecimal allocationApplyOrderDetailUseRate;
    @ApiCloudField(value="allocation_apply_order_detail_assist_qty")
    private BigDecimal allocationApplyOrderDetailAssistQty;
    @ApiCloudField(value="allocation_apply_order_detail_item_assist_unit")
    private String allocationApplyOrderDetailItemAssistUnit;
    @ApiCloudField(value="allocation_apply_order_detail_out_inventory_qty")
    private BigDecimal allocationApplyOrderDetailOutInventoryQty;
    @ApiCloudField(value="allocation_apply_order_detail_out_inv_assist_qty")
    private BigDecimal allocationApplyOrderDetailOutInvAssistQty;
    @ApiCloudField(value="allocation_apply_order_detail_in_inventory_qty")
    private BigDecimal allocationApplyOrderDetailInInventoryQty;
    @ApiCloudField(value="allocation_apply_order_detail_in_inv_assist_qty")
    private BigDecimal allocationApplyOrderDetailInInvAssistQty;
    @ApiCloudField(value="allocation_apply_order_detail_out_qty")
    private BigDecimal allocationApplyOrderDetailOutQty;
    @ApiCloudField(value="allocation_apply_order_detail_memo")
    private String allocationApplyOrderDetailMemo;
    @ApiCloudField(value="allocation_apply_order_detail_item_barcode")
    private String allocationApplyOrderDetailItemBarcode;
}
