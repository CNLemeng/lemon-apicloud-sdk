package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OtherInoutVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OtherInoutVOModel extends ApiCloudObject {

    @ApiCloudField(value="other_inout_bill_no", example="OP2072010000016")
    private String otherInoutBillNo;
    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="supplier_num", example="434400009")
    private Integer supplierNum;
    @ApiCloudField(value="other_inout_kind", example="运费")
    private String otherInoutKind;
    @ApiCloudField(value="other_inout_kind_code", example="999999")
    private String otherInoutKindCode;
    @ApiCloudField(value="other_inout_payment_type", example="现金")
    private String otherInoutPaymentType;
    @ApiCloudField(value="other_inout_department")
    private String otherInoutDepartment;
    @ApiCloudField(value="other_inout_flag", example="false")
    private Boolean otherInoutFlag;
    @ApiCloudField(value="other_inout_creator", example="管理员")
    private String otherInoutCreator;
    @ApiCloudField(value="other_inout_date")
    private String otherInoutDate;
    @ApiCloudField(value="other_inout_memo", example="备注信息")
    private String otherInoutMemo;
    @ApiCloudField(value="other_inout_ref_bill", example="A00001")
    private String otherInoutRefBill;
    @ApiCloudField(value="other_inout_operator", example="业务员")
    private String otherInoutOperator;
    @ApiCloudField(value="other_inout_create_time")
    private String otherInoutCreateTime;
    @ApiCloudField(value="other_inout_auditor", example="管理员")
    private String otherInoutAuditor;
    @ApiCloudField(value="other_inout_audit_time")
    private String otherInoutAuditTime;
    @ApiCloudField(value="other_inout_last_edit_time")
    private String otherInoutLastEditTime;
    @ApiCloudField(value="other_inout_state_code", example="1")
    private Integer otherInoutStateCode;
    @ApiCloudField(value="other_inout_state_name", example="制单")
    private String otherInoutStateName;
    @ApiCloudField(value="other_inout_settlement_state")
    private Integer otherInoutSettlementState;
    @ApiCloudField(value="other_inout_money", example="1.0")
    private BigDecimal otherInoutMoney;
    @ApiCloudField(value="other_inout_paid_money", example="1.0")
    private BigDecimal otherInoutPaidMoney;
    @ApiCloudField(value="other_inout_discount_money", example="1.0")
    private BigDecimal otherInoutDiscountMoney;
    @ApiCloudField(value="other_inout_due_money")
    private BigDecimal otherInoutDueMoney;
    @ApiCloudField(value="other_inout_other_tax_rate")
    private BigDecimal otherInoutOtherTaxRate;
    @ApiCloudField(value="other_inout_other_tax_money")
    private BigDecimal otherInoutOtherTaxMoney;
    @ApiCloudField(value="inner_branch_num", example="1")
    private Integer innerBranchNum;
}
