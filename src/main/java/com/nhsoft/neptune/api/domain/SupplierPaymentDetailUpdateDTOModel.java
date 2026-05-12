package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPaymentDetailUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPaymentDetailUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="预结算单", example="")
    private String supplierPreSettlementNo;
    @ApiCloudField(value="结算单", example="")
    private String supplierSettlementNo;
    @ApiCloudField(value="明细付款金额")
    private BigDecimal settlementPaymentDetailMoney;
    @ApiCloudField(value="明细折扣金额")
    private BigDecimal settlementPaymentDetailDiscountMoney;
    @ApiCloudField(value="明细未付款金额")
    private BigDecimal settlementDetailUnPaidMoney;
    @ApiCloudField(value="明细备注", example="")
    private String settlementDetailMemo;
}
