package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseOrderBatchReceiveDetailReq模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderBatchReceiveDetailReqModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="purchase_order_detail_lot_number", example="20261201")
    private String purchaseOrderDetailLotNumber;
    @ApiCloudField(value="purchase_order_detail_branch_received_use_qty", example="5.0")
    private BigDecimal purchaseOrderDetailBranchReceivedUseQty;
    @ApiCloudField(value="purchase_order_detail_branch_received_qty", example="20.0")
    private BigDecimal purchaseOrderDetailBranchReceivedQty;
    @ApiCloudField(value="purchase_order_detail_present_unit")
    private String purchaseOrderDetailPresentUnit;
    @ApiCloudField(value="purchase_order_detail_present_use_qty")
    private BigDecimal purchaseOrderDetailPresentUseQty;
}
