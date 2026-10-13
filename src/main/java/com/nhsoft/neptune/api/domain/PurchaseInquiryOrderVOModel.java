package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseInquiryOrderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseInquiryOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="purchase_inquiry_order_fid", example="PIO99675992609220001")
    private String purchaseInquiryOrderFid;
    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="purchase_inquiry_order_name", example="测试询价")
    private String purchaseInquiryOrderName;
    @ApiCloudField(value="purchase_inquiry_order_create_time", example="2026-09-22 00:00:00")
    private String purchaseInquiryOrderCreateTime;
    @ApiCloudField(value="purchase_inquiry_order_deadline", example="2026-09-22 00:00:00")
    private String purchaseInquiryOrderDeadline;
    @ApiCloudField(value="state_code", example="1")
    private Integer stateCode;
    @ApiCloudField(value="state_name", example="制单")
    private String stateName;
    @ApiCloudField(value="purchase_inquiry_order_memo", example="A")
    private String purchaseInquiryOrderMemo;
    @ApiCloudField(value="purchase_inquiry_order_creator", example="admin")
    private String purchaseInquiryOrderCreator;
    @ApiCloudField(value="purchase_inquiry_order_auditor", example="admin")
    private String purchaseInquiryOrderAuditor;
    @ApiCloudField(value="purchase_inquiry_order_audit_time", example="2026-09-22 00:00:00")
    private String purchaseInquiryOrderAuditTime;
    @ApiCloudField(value="purchase_inquiry_order_cancel_operator", example="admin")
    private String purchaseInquiryOrderCancelOperator;
    @ApiCloudField(value="purchase_inquiry_order_cancel_time", example="2026-09-22 00:00:00")
    private String purchaseInquiryOrderCancelTime;
    @ApiCloudField(value="purchase_inquiry_order_repeal_flag", example="true")
    private Boolean purchaseInquiryOrderRepealFlag;
    @ApiCloudField(value="purchase_inquiry_order_department")
    private String purchaseInquiryOrderDepartment;
    @ApiCloudField(value="purchase_inquiry_order_purchase_date", example="2026-09-22 00:00:00")
    private String purchaseInquiryOrderPurchaseDate;
    @ApiCloudField(value="purchase_inquiry_order_last_edit_time", example="2026-09-22 00:00:00")
    private String purchaseInquiryOrderLastEditTime;
    @ApiCloudField(value="purchase_inquiry_order_last_editor", example="admin")
    private String purchaseInquiryOrderLastEditor;
    @ApiCloudField(value="transfer_qty_not_over_purchase_qty", example="true")
    private Boolean transferQtyNotOverPurchaseQty;
    @ApiCloudField(value="purchase_qty_not_over_plan_qty", example="true")
    private Boolean purchaseQtyNotOverPlanQty;
    @ApiCloudField(value="purchase_price_not_over_supplier_price", example="true")
    private Boolean purchasePriceNotOverSupplierPrice;
    @ApiCloudField(value="supplier_nums", example="[1]")
    private List<Integer> supplierNums;
}
