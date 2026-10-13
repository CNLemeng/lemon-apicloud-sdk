package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PreferentialParam模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PreferentialParamModel extends ApiCloudObject {

    @ApiCloudField(value="preferential_way", example="折扣")
    private String preferentialWay;
    @ApiCloudField(value="contract_time_from", example="2026-09-20 04:00:00")
    private String contractTimeFrom;
    @ApiCloudField(value="contract_time_to", example="2026-09-23 04:00:00")
    private String contractTimeTo;
    @ApiCloudField(value="preferential_percent", example="0.1")
    private BigDecimal preferentialPercent;
}
