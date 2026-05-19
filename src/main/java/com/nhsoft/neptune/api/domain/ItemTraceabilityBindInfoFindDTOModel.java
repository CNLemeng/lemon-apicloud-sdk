package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityBindInfoFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityBindInfoFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="date_from", example="2023-04-01 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="date_to")
    private String dateTo;
    @ApiCloudField(value="detail_type")
    private Integer detailType;
}
