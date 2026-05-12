package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="keyword")
    private String keyword;
    @ApiCloudField(value="date_type", required=true)
    private String dateType;
    @ApiCloudField(value="date_from", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", required=true)
    private String dateTo;
    @ApiCloudField(value="state_codes")
    private List<Integer> stateCodes;
    @ApiCloudField(value="item_nums")
    private List<Integer> itemNums;
    @ApiCloudField(value="box_code_flag")
    private Boolean boxCodeFlag;
    @ApiCloudField(value="item_traceability_ids")
    private List<String> itemTraceabilityIds;
    @ApiCloudField(value="size")
    private Integer size;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="10", required=true)
    private Integer pageSize;
}
