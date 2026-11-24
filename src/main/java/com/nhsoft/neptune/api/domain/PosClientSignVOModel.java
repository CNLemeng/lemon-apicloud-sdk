package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientSignVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientSignVOModel extends ApiCloudObject {

    @ApiCloudField(value="payment_no", example="9967501261039790010")
    private String paymentNo;
    @ApiCloudField(value="order_no", example="9967501261039790014")
    private String orderNo;
    @ApiCloudField(value="client_fid", example="0099675010000023")
    private String clientFid;
    @ApiCloudField(value="branch_num", example="1")
    private Integer branchNum;
    @ApiCloudField(value="shift_table_num", example="9790141")
    private Integer shiftTableNum;
    @ApiCloudField(value="shift_table_bizday", example="20260413")
    private String shiftTableBizday;
    @ApiCloudField(value="payment_time")
    private String paymentTime;
    @ApiCloudField(value="payment_pay_by", example="签单")
    private String paymentPayBy;
    @ApiCloudField(value="payment_money", example="20.0")
    private BigDecimal paymentMoney;
    @ApiCloudField(value="payment_balance")
    private BigDecimal paymentBalance;
    @ApiCloudField(value="discount_money")
    private BigDecimal discountMoney;
    @ApiCloudField(value="settlement_branch_num", example="1")
    private Integer settlementBranchNum;
    @ApiCloudField(value="settlement_client_fid", example="0099675010000023")
    private String settlementClientFid;
}
