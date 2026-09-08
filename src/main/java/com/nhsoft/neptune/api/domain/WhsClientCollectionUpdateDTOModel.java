package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsClientCollectionUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsClientCollectionUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户收款单号", example="CC99675990000027", required=true)
    private String collectionNo;
    @ApiCloudField(value="客户编号", example="002003990000001", required=true)
    private String clientFid;
    @ApiCloudField(value="结算门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="收款日期", example="2024-01-01 00:00:00")
    private String collectionDate;
    @ApiCloudField(value="收款方式", example="现金")
    private String collectionType;
    @ApiCloudField(value="collection_memo", example="测试")
    private String collectionMemo;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="收款金额", example="500.0")
    private BigDecimal collectionTotalMoney;
    @ApiCloudField(value="现金银行编号")
    private Integer accountBankNum;
    @ApiCloudField(value="预收余额", example="0.0")
    private BigDecimal collectionPreMoney;
    @ApiCloudField(value="优惠金额", example="10.0")
    private BigDecimal collectionDiscountMoney;
    @ApiCloudField(value="结算明细", required=true)
    private List<WhsClientCollectionSaveDetailDTOModel> clientCollectionDetails;
    @ApiCloudField(value="client_collection_payment_details", required=true)
    private List<ClientCollectionPaymentDetailSaveDTOModel> clientCollectionPaymentDetails;
}
