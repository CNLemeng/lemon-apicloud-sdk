package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardRefundDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardRefundDTOModel extends ApiCloudObject {

    @ApiCloudField(value="card_id", required=true)
    private Long cardId;
    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="clear_balance")
    private Boolean clearBalance;
    @ApiCloudField(value="operator", required=true)
    private String operator;
}
