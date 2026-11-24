package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="purchase_time_from", example="2026-10-01 00:00:00", required=true)
    private String purchaseTimeFrom;
    @ApiCloudField(value="purchase_time_to", example="2026-11-01 00:00:00", required=true)
    private String purchaseTimeTo;
    @ApiCloudField(value="branch_ids")
    private List<Integer> branchIds;
    @ApiCloudField(value="card_printed_num", example="400000000578")
    private String cardPrintedNum;
    @ApiCloudField(value="key_word")
    private String keyWord;
    @ApiCloudField(value="card_type_id", example="28")
    private Long cardTypeId;
    @ApiCloudField(value="query_init_card", example="true")
    private Boolean queryInitCard;
    @ApiCloudField(value="batch_id", example="9967500000056")
    private Long batchId;
    @ApiCloudField(value="query_card_scope", example="ENABLE")
    private String queryCardScope;
    @ApiCloudField(value="query_purchase_card", example="true")
    private Boolean queryPurchaseCard;
    @ApiCloudField(value="bill_no")
    private String billNo;
    @ApiCloudField(value="payment_type")
    private String paymentType;
    @ApiCloudField(value="settlement_flag")
    private Boolean settlementFlag;
    @ApiCloudField(value="card_type_ids")
    private List<Long> cardTypeIds;
    @ApiCloudField(value="account_branch_id")
    private Integer accountBranchId;
    @ApiCloudField(value="phone")
    private String phone;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为100)", example="10", required=true)
    private Integer pageSize;
}
