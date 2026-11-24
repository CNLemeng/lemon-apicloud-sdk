package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardBindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardBindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="card_id", example="608", required=true)
    private Long cardId;
    @ApiCloudField(value="card_password", example="123456", required=true)
    private String cardPassword;
    @ApiCloudField(value="phone", example="1764552100091", required=true)
    private String phone;
}
