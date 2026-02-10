package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseOrderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="采购订单号", example="PO2030990000001")
    private String purchaseOrderFid;
    @ApiCloudField(value="供应商编码", example="203000001")
    private Integer supplierNum;
    @ApiCloudField(value="订货门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="收货门店编码", example="1")
    private Integer receiveBranchNum;
    @ApiCloudField(value="收货仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="订货仓库编码", example="150050001")
    private Integer bookStorehouseNum;
    @ApiCloudField(value="创建时间")
    private String purchaseOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String purchaseOrderAuditor;
    @ApiCloudField(value="审核时间")
    private String purchaseOrderAuditTime;
    @ApiCloudField(value="作废时间")
    private String purchaseOrderCancelTime;
    @ApiCloudField(value="作废操作人", example="admin")
    private String purchaseOrderCancelOperator;
    @ApiCloudField(value="交货期限")
    private String purchaseOrderDeadline;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String purchaseOrderOperator;
    @ApiCloudField(value="状态代码", example="1")
    private Integer purchaseOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String purchaseOrderStateName;
    @ApiCloudField(value="备注", example="备注信息")
    private String purchaseOrderMemo;
    @ApiCloudField(value="创建人", example="管理员")
    private String purchaseOrderCreator;
    @ApiCloudField(value="采购金额（小数点2位）", example="1.0")
    private BigDecimal purchaseOrderTotalMoney;
    @ApiCloudField(value="采购日期")
    private String purchaseOrderDate;
    @ApiCloudField(value="收货状态（未收货，部分收货，全部收货）", example="全部收货")
    private String purchaseOrderReceiveState;
    @ApiCloudField(value="预付金额", example="100")
    private BigDecimal purchaseOrderPreMoney;
    @ApiCloudField(value="部门名称", example="零售部")
    private String purchaseOrderDepartment;
    @ApiCloudField(value="最后修改时间")
    private String purchaseOrderLastEditTime;
    @ApiCloudField(value="最后修改人", example="管理员")
    private String purchaseOrderLastEditor;
    @ApiCloudField(value="直配采购附加费", example="10.0")
    private BigDecimal purchaseOrderAppendMoney;
    @ApiCloudField(value="采购税额（小数点2位）", example="1.0")
    private BigDecimal purchaseOrderTaxMoney;
    @ApiCloudField(value="采购不含税金额（小数点2位）", example="1.0")
    private BigDecimal purchaseOrderNoTaxMoney;
    @ApiCloudField(value="供应商送货金额")
    private BigDecimal purchaseOrderCustMoney;
    @ApiCloudField(value="外部单号")
    private String purchaseOrderOutBillNo;
    @ApiCloudField(value="件数", example="20.0")
    private BigDecimal purchaseOrderUseQty;
    @ApiCloudField(value="配送金额（小数点2位）", example="1.0")
    private BigDecimal purchaseOrderTransferTotalMoney;
    @ApiCloudField(value="收货采购金额（小数点2位）", example="1.0")
    private BigDecimal purchaseOrderPurchaseReceivedMoney;
    @ApiCloudField(value="供货状态(已处理|未处理)", example="已处理")
    private String purchaseOrderLabel;
    @ApiCloudField(value="明细")
    private List<DirectPurchaseOrderDetailVOModel> purchaseOrderDetails;
}
