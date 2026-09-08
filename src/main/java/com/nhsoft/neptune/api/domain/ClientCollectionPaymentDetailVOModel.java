package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientCollectionPaymentDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientCollectionPaymentDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="client_collection_payment_detail_num", example="1")
    private Integer clientCollectionPaymentDetailNum;
    @ApiCloudField(value="现金银行编号", example="43440001")
    private Integer accountBankNum;
    @ApiCloudField(value="client_collection_payment_type", example="支付宝")
    private String clientCollectionPaymentType;
    @ApiCloudField(value="client_collection_payment_detail_money", example="113.0")
    private BigDecimal clientCollectionPaymentDetailMoney;
}
