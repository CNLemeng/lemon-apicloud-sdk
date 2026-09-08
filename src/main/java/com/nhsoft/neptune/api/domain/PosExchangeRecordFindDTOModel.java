package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosExchangeRecordFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosExchangeRecordFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="date_from", example="2026-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-01-02 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="branch_nums", example="[\"1\"]")
    private List<Integer> branchNums;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="300", required=true)
    private Integer pageSize;
}
