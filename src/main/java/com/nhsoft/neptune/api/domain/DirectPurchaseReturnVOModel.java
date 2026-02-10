package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseReturnVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseReturnVOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商直退单", example="PR99675010000049")
    private String returnOrderFid;
    @ApiCloudField(value="供应商直配单号")
    private String purchaseOrderFid;
    @ApiCloudField(value="供应商编码", example="203000001")
    private Integer supplierNum;
    @ApiCloudField(value="退货门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="收货门店编码", example="99")
    private Integer receiveBranchNum;
    @ApiCloudField(value="退货仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="收货仓库编码", example="150050001")
    private Integer receiveStorehouseNum;
    @ApiCloudField(value="创建时间")
    private String returnOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String returnOrderAuditor;
    @ApiCloudField(value="审核时间")
    private String returnOrderAuditTime;
    @ApiCloudField(value="作废时间")
    private String returnOrderCancelTime;
    @ApiCloudField(value="作废操作人", example="admin")
    private String returnOrderCancelOperator;
    @ApiCloudField(value="交货期限")
    private String returnOrderDeadline;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String returnOrderOperator;
    @ApiCloudField(value="状态代码", example="1")
    private Integer returnOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String returnOrderStateName;
    @ApiCloudField(value="备注", example="备注信息")
    private String returnOrderMemo;
    @ApiCloudField(value="创建人", example="管理员")
    private String returnOrderCreator;
    @ApiCloudField(value="退货金额（小数点2位）", example="1.0")
    private BigDecimal returnOrderTotalMoney;
    @ApiCloudField(value="采购日期")
    private String returnOrderDate;
    @ApiCloudField(value="收货状态（未收货，部分收货，全部收货）", example="全部收货")
    private String returnOrderReceiveState;
    @ApiCloudField(value="预付金额", example="100")
    private BigDecimal returnOrderPreMoney;
    @ApiCloudField(value="部门名称", example="零售部")
    private String returnOrderDepartment;
    @ApiCloudField(value="最后修改时间")
    private String returnOrderLastEditTime;
    @ApiCloudField(value="最后修改人", example="管理员")
    private String returnOrderLastEditor;
    @ApiCloudField(value="直配采购附加费", example="10.0")
    private BigDecimal returnOrderAppendMoney;
    @ApiCloudField(value="采购税额（小数点2位）", example="1.0")
    private BigDecimal returnOrderTaxMoney;
    @ApiCloudField(value="采购不含税金额（小数点2位）", example="1.0")
    private BigDecimal returnOrderNoTaxMoney;
    @ApiCloudField(value="供应商送货金额")
    private BigDecimal returnOrderCustMoney;
    @ApiCloudField(value="件数", example="20.0")
    private BigDecimal returnOrderUseQty;
    @ApiCloudField(value="配送金额（小数点2位）", example="1.0")
    private BigDecimal returnOrderTransferTotalMoney;
    @ApiCloudField(value="收货采购金额（小数点2位）", example="1.0")
    private BigDecimal returnOrderPurchaseReceivedMoney;
    @ApiCloudField(value="供货状态(已处理|未处理)", example="已处理")
    private String returnOrderLabel;
    @ApiCloudField(value="明细")
    private List<DirectPurchaseReturnDetailVOModel> returnOrderDetails;
}
