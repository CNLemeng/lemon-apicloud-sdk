package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardVOModel extends ApiCloudObject {

    @ApiCloudField(value="card_id")
    private Long cardId;
    @ApiCloudField(value="card_type_id")
    private Long cardTypeId;
    @ApiCloudField(value="purchase_time")
    private String purchaseTime;
    @ApiCloudField(value="expire_time")
    private String expireTime;
    @ApiCloudField(value="card_face_background")
    private String cardFaceBackground;
    @ApiCloudField(value="card_printed_num")
    private String cardPrintedNum;
    @ApiCloudField(value="sell_price")
    private BigDecimal sellPrice;
    @ApiCloudField(value="state_code")
    private Integer stateCode;
    @ApiCloudField(value="state_name")
    private String stateName;
    @ApiCloudField(value="init_time")
    private Integer initTime;
    @ApiCloudField(value="balance_time")
    private Integer balanceTime;
    @ApiCloudField(value="branch_id")
    private Integer branchId;
    @ApiCloudField(value="account_branch_id")
    private Integer accountBranchId;
    @ApiCloudField(value="batch_id")
    private Long batchId;
    @ApiCloudField(value="card_password")
    private String cardPassword;
    @ApiCloudField(value="phone")
    private String phone;
    @ApiCloudField(value="obtain_type")
    private String obtainType;
    @ApiCloudField(value="bill_no")
    private String billNo;
    @ApiCloudField(value="source")
    private String source;
    @ApiCloudField(value="payment_type")
    private String paymentType;
    @ApiCloudField(value="settlement_flag")
    private Boolean settlementFlag;
    @ApiCloudField(value="shift_table_bizday")
    private String shiftTableBizday;
    @ApiCloudField(value="shift_table_num")
    private Integer shiftTableNum;
    @ApiCloudField(value="exchange_card_type_name")
    private String exchangeCardTypeName;
    @ApiCloudField(value="branch_name")
    private String branchName;
    @ApiCloudField(value="account_branch_name")
    private String accountBranchName;
    @ApiCloudField(value="settlement_money")
    private BigDecimal settlementMoney;
    @ApiCloudField(value="point_value")
    private Integer pointValue;
}
