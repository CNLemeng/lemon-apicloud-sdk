package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemCustomerAnalysisVO模型
 * 开放平台客单分析结果行
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemCustomerAnalysisVOModel extends ApiCloudObject {

    @ApiCloudField(value="时段范围")
    private String timePeriod;
    @ApiCloudField(value="门店编号；选择 branch 维度时返回")
    private Integer branchNum;
    @ApiCloudField(value="门店代码；选择 branch 维度时返回")
    private String branchCode;
    @ApiCloudField(value="门店名称；选择 branch 维度时返回")
    private String branchName;
    @ApiCloudField(value="营业日；选择 bizday 维度时返回")
    private String bizday;
    @ApiCloudField(value="商品类别代码；选择 category 维度时返回")
    private String categoryCode;
    @ApiCloudField(value="商品类别名称；选择 category 维度时返回")
    private String categoryName;
    @ApiCloudField(value="门店营业额")
    private BigDecimal receiveMoney;
    @ApiCloudField(value="门店客单数")
    private BigDecimal customerNums;
    @ApiCloudField(value="会员营业额")
    private BigDecimal customerVipMoney;
    @ApiCloudField(value="会员客单数")
    private BigDecimal customerVipNums;
    @ApiCloudField(value="销售成本")
    private BigDecimal itemSaleCost;
    @ApiCloudField(value="销售毛利")
    private BigDecimal itemSaleProfit;
}
