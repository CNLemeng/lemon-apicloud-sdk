package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseOrderSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="supplier_num", example="203000001", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="receive_branch_num", example="1", required=true)
    private Integer receiveBranchNum;
    @ApiCloudField(value="storehouse_num", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="book_storehouse_num", example="150050001", required=true)
    private Integer bookStorehouseNum;
    @ApiCloudField(value="purchase_order_date", example="2021-01-20 22:00:00", required=true)
    private String purchaseOrderDate;
    @ApiCloudField(value="purchase_order_deadline", example="2021-01-20 22:00:00", required=true)
    private String purchaseOrderDeadline;
    @ApiCloudField(value="purchase_order_operator", example="业务员名称", required=true)
    private String purchaseOrderOperator;
    @ApiCloudField(value="purchase_order_memo", example="备注信息")
    private String purchaseOrderMemo;
    @ApiCloudField(value="purchase_order_out_bill_no")
    private String purchaseOrderOutBillNo;
    @ApiCloudField(value="purchase_order_details", required=true)
    private List<DirectPurchaseOrderDetailSaveDTOModel> purchaseOrderDetails;
}
