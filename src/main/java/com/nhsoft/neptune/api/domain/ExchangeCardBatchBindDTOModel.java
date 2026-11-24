package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardBatchBindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardBatchBindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="operator", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="card_binds", required=true)
    private List<ExchangeCardBindDTOModel> cardBinds;
}
