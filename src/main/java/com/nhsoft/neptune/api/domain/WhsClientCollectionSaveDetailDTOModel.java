package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsClientCollectionSaveDetailDTO模型
 * 结算明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsClientCollectionSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="client_settlement_no", example="RP99675992606230001", required=true)
    private String clientSettlementNo;
    @ApiCloudField(value="settlement_collection_detail_money", example="113.0", required=true)
    private BigDecimal settlementCollectionDetailMoney;
    @ApiCloudField(value="优惠金额", example="10.0", required=true)
    private BigDecimal settlementCollectionDetailDiscountMoney;
}
