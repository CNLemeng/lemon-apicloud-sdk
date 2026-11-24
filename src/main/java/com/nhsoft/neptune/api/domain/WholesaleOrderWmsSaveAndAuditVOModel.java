package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderWmsSaveAndAuditVO模型
 * WMS批发销售单保存并审核结果
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderWmsSaveAndAuditVOModel extends ApiCloudObject {

    @ApiCloudField(value="批发销售单号")
    private String wholesaleOrderFid;
    @ApiCloudField(value="账套号")
    private String systemBookCode;
    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="仓库编号")
    private Integer storehouseNum;
    @ApiCloudField(value="客户编号")
    private String clientFid;
    @ApiCloudField(value="销售日期")
    private String wholesaleOrderDate;
    @ApiCloudField(value="付款日期")
    private String wholesaleOrderPaymentDate;
    @ApiCloudField(value="wholesale_order_seller")
    private String wholesaleOrderSeller;
    @ApiCloudField(value="wholesale_order_out_bill_no")
    private String wholesaleOrderOutBillNo;
    @ApiCloudField(value="wholesale_order_uuid")
    private String wholesaleOrderUuid;
    @ApiCloudField(value="state")
    private WholesaleOrderWmsSaveAndAuditStateVOModel state;
    @ApiCloudField(value="flow_state_code")
    private Integer flowStateCode;
    @ApiCloudField(value="flow_state_name")
    private String flowStateName;
    @ApiCloudField(value="创建时间")
    private String wholesaleOrderCreateTime;
    @ApiCloudField(value="wholesale_order_creator")
    private String wholesaleOrderCreator;
    @ApiCloudField(value="审核时间")
    private String wholesaleOrderAuditTime;
    @ApiCloudField(value="wholesale_order_auditor")
    private String wholesaleOrderAuditor;
    @ApiCloudField(value="wholesale_order_memo")
    private String wholesaleOrderMemo;
    @ApiCloudField(value="销售单总金额")
    private BigDecimal wholesaleOrderTotalMoney;
    @ApiCloudField(value="折扣金额")
    private BigDecimal wholesaleOrderDiscountMoney;
    @ApiCloudField(value="应付金额")
    private BigDecimal wholesaleOrderDueMoney;
    @ApiCloudField(value="已付金额")
    private BigDecimal wholesaleOrderPaidMoney;
    @ApiCloudField(value="wholesale_order_transfer_flag")
    private Boolean wholesaleOrderTransferFlag;
    @ApiCloudField(value="wholesale_order_pay_money")
    private BigDecimal wholesaleOrderPayMoney;
    @ApiCloudField(value="wholesale_order_pay_discount")
    private BigDecimal wholesaleOrderPayDiscount;
    @ApiCloudField(value="wholesale_order_print_count")
    private Integer wholesaleOrderPrintCount;
    @ApiCloudField(value="region_num")
    private Integer regionNum;
    @ApiCloudField(value="wholesale_order_inner_no")
    private String wholesaleOrderInnerNo;
    @ApiCloudField(value="成本金额")
    private BigDecimal wholesaleOrderCostMoney;
    @ApiCloudField(value="wholesale_order_audit_bizday")
    private String wholesaleOrderAuditBizday;
    @ApiCloudField(value="wholesale_order_department")
    private String wholesaleOrderDepartment;
    @ApiCloudField(value="最后修改时间")
    private String wholesaleOrderLastEditTime;
    @ApiCloudField(value="wholesale_order_last_editor")
    private String wholesaleOrderLastEditor;
    @ApiCloudField(value="settlement_branch_num")
    private Integer settlementBranchNum;
    @ApiCloudField(value="wholesale_order_tax_money")
    private BigDecimal wholesaleOrderTaxMoney;
    @ApiCloudField(value="wholesale_order_no_tax_money")
    private BigDecimal wholesaleOrderNoTaxMoney;
    @ApiCloudField(value="sale_order_use_qty")
    private BigDecimal saleOrderUseQty;
    @ApiCloudField(value="sale_order_item_count")
    private Integer saleOrderItemCount;
    @ApiCloudField(value="销售单明细")
    private List<WholesaleOrderWmsSaveAndAuditDetailVOModel> wholesaleOrderDetails;
    @ApiCloudField(value="wholesale_order_payment_details")
    private List<Object> wholesaleOrderPaymentDetails;
    @ApiCloudField(value="关联批发订单")
    private List<WholesaleOrderWmsSaveAndAuditBookVOModel> wholesaleBooks;
    @ApiCloudField(value="settlement_client_fid")
    private String settlementClientFid;
    @ApiCloudField(value="keep_inner_no")
    private Boolean keepInnerNo;
    @ApiCloudField(value="from_wms")
    private Boolean fromWms;
    @ApiCloudField(value="ticket_submit_state")
    private Integer ticketSubmitState;
    @ApiCloudField(value="wholesale_order_transfer_type")
    private String wholesaleOrderTransferType;
    @ApiCloudField(value="wholesale_order_receivor")
    private String wholesaleOrderReceivor;
    @ApiCloudField(value="wholesale_order_phone")
    private String wholesaleOrderPhone;
    @ApiCloudField(value="edit_qty_enable")
    private Boolean editQtyEnable;
    @ApiCloudField(value="total_weight")
    private BigDecimal totalWeight;
    @ApiCloudField(value="total_area_size")
    private BigDecimal totalAreaSize;
    @ApiCloudField(value="coupon_discount_money")
    private BigDecimal couponDiscountMoney;
    @ApiCloudField(value="vehicle_launch_state")
    private Integer vehicleLaunchState;
    @ApiCloudField(value="receive_state")
    private Integer receiveState;
    @ApiCloudField(value="present_use_qty")
    private BigDecimal presentUseQty;
    @ApiCloudField(value="wholesale_return_details")
    private List<Object> wholesaleReturnDetails;
    @ApiCloudField(value="service_tax_money")
    private BigDecimal serviceTaxMoney;
    @ApiCloudField(value="汇率")
    private BigDecimal exchangeRate;
    @ApiCloudField(value="order_local_total_money")
    private BigDecimal orderLocalTotalMoney;
    @ApiCloudField(value="deposit_basket_details")
    private List<Object> depositBasketDetails;
    @ApiCloudField(value="rounding_rule")
    private Integer roundingRule;
    @ApiCloudField(value="金额精度")
    private BigDecimal precision;
    @ApiCloudField(value="local_rounding_rule")
    private Integer localRoundingRule;
    @ApiCloudField(value="本币金额精度")
    private BigDecimal localPrecision;
    @ApiCloudField(value="wholesale_order_cargo_status")
    private String wholesaleOrderCargoStatus;
    @ApiCloudField(value="结算状态")
    private String settleMentState;
    @ApiCloudField(value="sale_use_qty")
    private BigDecimal saleUseQty;
    @ApiCloudField(value="receive_state_str")
    private String receiveStateStr;
    @ApiCloudField(value="vehicle_launch_state_str")
    private String vehicleLaunchStateStr;
    @ApiCloudField(value="未付金额")
    private BigDecimal unPaidMoney;
}
