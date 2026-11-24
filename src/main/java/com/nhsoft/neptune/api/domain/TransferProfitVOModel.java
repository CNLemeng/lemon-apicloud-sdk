package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferProfitVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferProfitVOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="category_code")
    private String categoryCode;
    @ApiCloudField(value="branch_num")
    private Integer branchNum;
    @ApiCloudField(value="bizday")
    private String bizday;
    @ApiCloudField(value="current")
    private MetricsModel current;
    @ApiCloudField(value="comparison")
    private MetricsModel comparison;
    @ApiCloudField(value="category_average")
    private MetricsModel categoryAverage;
    @ApiCloudField(value="comparison_category_average")
    private MetricsModel comparisonCategoryAverage;
}
