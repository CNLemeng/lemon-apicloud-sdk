package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPaymentSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPaymentSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编号", example="207200003", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="银行名称", example="农业银行", required=true)
    private String paymentBank;
    @ApiCloudField(value="银行账号", example="65554985621452356", required=true)
    private String paymentBankAccount;
    @ApiCloudField(value="付款时间", required=true)
    private String paymentDateTime;
    @ApiCloudField(value="付款类型", example="现金", required=true)
    private String paymentType;
    @ApiCloudField(value="备注", example="")
    private String paymentMemo;
    @ApiCloudField(value="操作人", example="zxnb", required=true)
    private String operator;
    @ApiCloudField(value="现金银行编号", example="207200001", required=true)
    private Integer accountBankNum;
    @ApiCloudField(value="结算方式", example="")
    private String settlementStyle;
    @ApiCloudField(value="供应商付款明细", example="", required=true)
    private List<SupplierPaymentDetailUpdateDTOModel> settlementPaymentDetails;
}
