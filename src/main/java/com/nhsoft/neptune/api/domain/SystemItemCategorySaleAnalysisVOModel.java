package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemItemCategorySaleAnalysisVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemItemCategorySaleAnalysisVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号；summary 为 item 时返回")
    private Integer itemNum;
    @ApiCloudField(value="商品名称；summary 为 item 时返回")
    private String itemName;
    @ApiCloudField(value="类别代码")
    private String categoryCode;
    @ApiCloudField(value="类别名称")
    private String categoryName;
    @ApiCloudField(value="销售数量")
    private BigDecimal totalAmount;
    @ApiCloudField(value="销售金额")
    private BigDecimal totalMoney;
    @ApiCloudField(value="销售毛利")
    private BigDecimal profit;
    @ApiCloudField(value="销售金额（不含券）")
    private BigDecimal totalMoneyNoCoupon;
    @ApiCloudField(value="销售毛利（不含券）")
    private BigDecimal profitNoCoupon;
    @ApiCloudField(value="日店均销量")
    private BigDecimal psd;
    @ApiCloudField(value="动销门店数")
    private BigDecimal branchCount;
    @ApiCloudField(value="动销门店占比，百分比数值")
    private BigDecimal branchCountRatio;
    @ApiCloudField(value="对比期间销售数量；ratio_type 为 none 时返回 0")
    private BigDecimal totalAmountRange;
    @ApiCloudField(value="对比期间销售金额；ratio_type 为 none 时返回 0")
    private BigDecimal totalMoneyRange;
    @ApiCloudField(value="对比期间销售毛利；ratio_type 为 none 时返回 0")
    private BigDecimal profitRange;
    @ApiCloudField(value="对比期间销售金额（不含券）；ratio_type 为 none 时返回 0")
    private BigDecimal totalMoneyNoCouponRange;
    @ApiCloudField(value="对比期间销售毛利（不含券）；ratio_type 为 none 时返回 0")
    private BigDecimal profitNoCouponRange;
    @ApiCloudField(value="对比期间日店均销量；ratio_type 为 none 时返回 0")
    private BigDecimal psdRange;
    @ApiCloudField(value="对比期间动销门店数；ratio_type 为 none 时返回 0")
    private BigDecimal branchCountRange;
    @ApiCloudField(value="对比期间动销门店占比，百分比数值；ratio_type 为 none 时返回 0")
    private BigDecimal branchCountRatioRange;
}
