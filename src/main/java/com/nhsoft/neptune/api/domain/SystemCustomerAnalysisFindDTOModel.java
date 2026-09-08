package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemCustomerAnalysisFindDTO模型
 * 开放平台客单分析请求；固定按时段范围汇总
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemCustomerAnalysisFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="营业开始日，格式 yyyy-MM-dd", example="2026-08-01", required=true)
    private String bizdayStart;
    @ApiCloudField(value="营业结束日，格式 yyyy-MM-dd；含首尾最多查询 31 天", example="2026-08-07", required=true)
    private String bizdayEnd;
    @ApiCloudField(value="time_start", required=true)
    private String timeStart;
    @ApiCloudField(value="time_end", required=true)
    private String timeEnd;
    @ApiCloudField(value="时段间隔分钟数，范围 1 到 1440", example="60", required=true)
    private Integer intervalMinutes;
    @ApiCloudField(value="可选汇总维度；时段范围固定返回，最多选择 branch（门店）、bizday（营业日）、category（类别）中的两项", example="[\"branch\",\"bizday\"]")
    private List<String> summaryTypes;
    @ApiCloudField(value="门店编号列表，必传，最多 100 家；不进行用户门店权限校验", example="[1,2]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="商品编号多选；未传时不限制商品", example="[2160]")
    private List<Integer> itemNums;
    @ApiCloudField(value="商品类别代码多选；未传时不限制类别", example="[\"1101\"]")
    private List<String> categoryCodes;
}
