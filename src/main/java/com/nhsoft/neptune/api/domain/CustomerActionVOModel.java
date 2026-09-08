package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerActionVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerActionVOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private Long id;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="action_type")
    private String actionType;
    @ApiCloudField(value="state_code")
    private Integer stateCode;
    @ApiCloudField(value="state_name")
    private String stateName;
    @ApiCloudField(value="date_from", example="2026-01-01 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-12-01 00:00:00")
    private String dateTo;
}
