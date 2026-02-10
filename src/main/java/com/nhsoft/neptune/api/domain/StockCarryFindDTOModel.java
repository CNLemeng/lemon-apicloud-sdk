package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StockCarryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StockCarryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="日期类型(制单日期|结转日期)", example="结转日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期", example="2021-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="2021-01-02 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="选择门店", example="[99]")
    private List<Integer> branchNums;
    @ApiCloudField(value="状态(2:已结转;1、4:未结转;3:结转中)", example="[2]")
    private List<Integer> status;
    @ApiCloudField(value="是否预结转(空：都查；true:只查预结转；false:只查非预结转)", example="true")
    private Boolean stockCarryPreStock;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="200", required=true)
    private Integer pageSize;
}
