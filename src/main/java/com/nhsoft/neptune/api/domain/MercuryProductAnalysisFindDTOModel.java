package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MercuryProductAnalysisFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MercuryProductAnalysisFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="start_time", example="2026-09-01", required=true)
    private String startTime;
    @ApiCloudField(value="end_time", example="2026-09-01", required=true)
    private String endTime;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="100", required=true)
    private Integer pageSize;
    @ApiCloudField(value="product_ids")
    private List<Long> productIds;
    @ApiCloudField(value="variant_dimension", example="false")
    private Boolean variantDimension;
    @ApiCloudField(value="variant_ids")
    private List<Long> variantIds;
    @ApiCloudField(value="branch_nums")
    private List<Long> branchNums;
}
