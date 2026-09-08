package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerActionFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerActionFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="207200003106")
    private Long id;
    @ApiCloudField(value="name", example="储值有礼2026")
    private String name;
    @ApiCloudField(value="action_type", example="DEPOSIT", required=true)
    private String actionType;
    @ApiCloudField(value="state", example="1")
    private Integer state;
    @ApiCloudField(value="date_from", example="2026-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-12-01 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="300", required=true)
    private Integer pageSize;
}
