package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseInquiryOrderUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseInquiryOrderUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="purchase_inquiry_order_name", required=true)
    private String purchaseInquiryOrderName;
    @ApiCloudField(value="operator", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="purchase_inquiry_order_deadline", example="2026-09-04 23:59:59", required=true)
    private String purchaseInquiryOrderDeadline;
    @ApiCloudField(value="purchase_inquiry_order_purchase_date", example="2026-09-04 23:59:59", required=true)
    private String purchaseInquiryOrderPurchaseDate;
    @ApiCloudField(value="purchase_inquiry_order_memo", example="备注")
    private String purchaseInquiryOrderMemo;
    @ApiCloudField(value="transfer_qty_not_over_purchase_qty", example="false")
    private Boolean transferQtyNotOverPurchaseQty;
    @ApiCloudField(value="purchase_inquiry_order_details", required=true)
    private List<PurchaseInquiryOrderDetailSaveDTOModel> purchaseInquiryOrderDetails;
    @ApiCloudField(value="supplier_nums", example="[9967500001]", required=true)
    private List<Integer> supplierNums;
    @ApiCloudField(value="purchase_inquiry_order_fid", example="PIO99675992609220001", required=true)
    private String purchaseInquiryOrderFid;
}
