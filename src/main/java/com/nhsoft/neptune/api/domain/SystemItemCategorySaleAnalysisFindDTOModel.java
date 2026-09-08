package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemItemCategorySaleAnalysisFindDTO模型
 * 开放平台品类销售分析请求
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemItemCategorySaleAnalysisFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="营业开始日，格式 yyyy-MM-dd", example="2026-08-01", required=true)
    private String bizdayStart;
    @ApiCloudField(value="营业结束日，格式 yyyy-MM-dd；与营业开始日含首尾最多查询 31 天", example="2026-08-07", required=true)
    private String bizdayEnd;
    @ApiCloudField(value="门店编号列表，必传，最多 100 家；不进行用户门店权限校验", example="[1,2]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="商品编号列表；item_nums 与 category_codes 至少传一个", example="[2160]")
    private List<Integer> itemNums;
    @ApiCloudField(value="商品类别代码列表；item_nums 与 category_codes 至少传一个", example="[\"1101\"]")
    private List<String> categoryCodes;
    @ApiCloudField(value="类别等级：-1 为当前类别，0 至 7 分别为一级至八级类别", example="-1")
    private Integer categoryLevel;
    @ApiCloudField(value="汇总类型：item（商品）或 category（类别）", example="item")
    private String summary;
    @ApiCloudField(value="对比类型：none（不对比）、mom（环比）或 yoy（同比）", example="none")
    private String ratioType;
}
