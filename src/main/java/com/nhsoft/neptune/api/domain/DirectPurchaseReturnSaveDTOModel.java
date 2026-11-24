package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseReturnSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseReturnSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="purchase_order_fid", required=true)
    private String purchaseOrderFid;
    @ApiCloudField(value="supplier_num", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="storehouse_num", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="receive_branch_num", required=true)
    private Integer receiveBranchNum;
    @ApiCloudField(value="receive_storehouse_num", required=true)
    private Integer receiveStorehouseNum;
    @ApiCloudField(value="return_order_date", required=true)
    private String returnOrderDate;
    @ApiCloudField(value="return_order_operator", required=true)
    private String returnOrderOperator;
    @ApiCloudField(value="return_order_memo")
    private String returnOrderMemo;
    @ApiCloudField(value="return_order_details", required=true)
    private List<DirectPurchaseReturnDetailSaveDTOModel> returnOrderDetails;
}
