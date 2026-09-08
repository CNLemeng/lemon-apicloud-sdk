package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemCategorySaleSummaryVO模型
 * 开放平台品类销售汇总结果行
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemCategorySaleSummaryVOModel extends ApiCloudObject {

    @ApiCloudField(value="类别代码")
    private String categoryCode;
    @ApiCloudField(value="类别名称")
    private String categoryName;
    @ApiCloudField(value="商品 SKU 数量")
    private BigDecimal skuNum;
    @ApiCloudField(value="销售金额")
    private BigDecimal totalMoney;
    @ApiCloudField(value="销售毛利")
    private BigDecimal profit;
    @ApiCloudField(value="销售金额（不含券）")
    private BigDecimal totalMoneyNoCoupon;
    @ApiCloudField(value="销售毛利（不含券）")
    private BigDecimal profitNoCoupon;
}
