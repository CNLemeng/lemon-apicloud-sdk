package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ExchangeCardBatchIdVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExchangeCardBatchIdVOModel extends ApiCloudObject {

    @ApiCloudField(value="batch_id")
    private Long batchId;
}
