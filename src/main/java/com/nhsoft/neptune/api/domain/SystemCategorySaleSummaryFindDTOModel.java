package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemCategorySaleSummaryFindDTO模型
 * 开放平台品类销售汇总请求
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemCategorySaleSummaryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="营业开始日，格式 yyyy-MM-dd", example="2026-08-01", required=true)
    private String bizdayStart;
    @ApiCloudField(value="营业结束日，格式 yyyy-MM-dd；与营业开始日含首尾最多查询 31 天", example="2026-08-07", required=true)
    private String bizdayEnd;
    @ApiCloudField(value="门店编号列表，必传，最多 100 家；不进行用户门店权限校验", example="[1,2]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="商品类别代码列表；未传时查询全部类别", example="[\"1101\"]")
    private List<String> categoryCodes;
    @ApiCloudField(value="类别等级：-1 为当前类别，0 至 7 分别为一级至八级类别", example="0")
    private Integer categoryLevel;
}
