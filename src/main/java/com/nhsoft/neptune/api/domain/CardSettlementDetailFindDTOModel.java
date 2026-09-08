package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardSettlementDetailFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardSettlementDetailFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="card_settlement_no", required=true)
    private String cardSettlementNo;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="100", required=true)
    private Integer pageSize;
}
