package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardTypeIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardTypeIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="次卡类型 ID", required=true)
    private Long id;
}
