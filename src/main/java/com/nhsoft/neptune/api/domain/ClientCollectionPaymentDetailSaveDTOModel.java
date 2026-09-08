package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientCollectionPaymentDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientCollectionPaymentDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="现金银行编号", example="43440001", required=true)
    private Integer accountBankNum;
    @ApiCloudField(value="client_collection_payment_type", example="支付宝", required=true)
    private String clientCollectionPaymentType;
    @ApiCloudField(value="client_collection_payment_detail_money", example="113.0", required=true)
    private BigDecimal clientCollectionPaymentDetailMoney;
}
