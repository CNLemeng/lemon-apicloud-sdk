package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProfitAnalysisItemGrossVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProfitAnalysisItemGrossVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店区域")
    private String branchRegionName;
    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="门店代码")
    private String branchCode;
    @ApiCloudField(value="门店名称")
    private String branchName;
    @ApiCloudField(value="类别代码")
    private String categoryCode;
    @ApiCloudField(value="类别名称")
    private String categoryName;
    @ApiCloudField(value="类别全称")
    private String allCategoryName;
    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编号")
    private Integer itemGradeNum;
    @ApiCloudField(value="商品类别")
    private String itemCode;
    @ApiCloudField(value="商品条码")
    private String itemBarCode;
    @ApiCloudField(value="商品名称")
    private String itemName;
    @ApiCloudField(value="商品别称")
    private String itemEnName;
    @ApiCloudField(value="规格")
    private String itemSpec;
    @ApiCloudField(value="计量单位")
    private String itemUnit;
    @ApiCloudField(value="品牌")
    private String itemBrand;
    @ApiCloudField(value="item_type")
    private String itemType;
    @ApiCloudField(value="item_extend1")
    private String itemExtend1;
    @ApiCloudField(value="item_extend2")
    private String itemExtend2;
    @ApiCloudField(value="item_extend3")
    private String itemExtend3;
    @ApiCloudField(value="item_extend4")
    private String itemExtend4;
    @ApiCloudField(value="item_extend5")
    private String itemExtend5;
    @ApiCloudField(value="item_extend6")
    private String itemExtend6;
    @ApiCloudField(value="进项税率")
    private BigDecimal itemInTax;
    @ApiCloudField(value="消项税率")
    private BigDecimal itemOutTax;
    @ApiCloudField(value="商品编号")
    private Integer departmenNum;
    @ApiCloudField(value="部门名称")
    private String departmenName;
    @ApiCloudField(value="营业日")
    private String bizDay;
    @ApiCloudField(value="营业月")
    private String bizDayMonth;
    @ApiCloudField(value="客户代码")
    private String clientCode;
    @ApiCloudField(value="客户名称")
    private String clientName;
    @ApiCloudField(value="一级类别代码")
    private String levelOneCode;
    @ApiCloudField(value="一级类别名称")
    private String levelOneName;
    @ApiCloudField(value="二级类别代码")
    private String levelTwoCode;
    @ApiCloudField(value="二级类别名称")
    private String levelTwoName;
    @ApiCloudField(value="三级类别代码")
    private String levelThreeCode;
    @ApiCloudField(value="三级类别名称")
    private String levelThreeName;
    @ApiCloudField(value="四级类别代码")
    private String levelFourCode;
    @ApiCloudField(value="四级类别名称")
    private String levelFourName;
    @ApiCloudField(value="商品档案进货价")
    private BigDecimal itemCostPrice;
    @ApiCloudField(value="商品档案配送价")
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="销售数量")
    private BigDecimal saleNum;
    @ApiCloudField(value="销售金额")
    private BigDecimal saleMoney;
    @ApiCloudField(value="销售金额")
    private BigDecimal saleNoTaxMoney;
    @ApiCloudField(value="销售成本")
    private BigDecimal saleCost;
    @ApiCloudField(value="销售成本")
    private BigDecimal saleNoTaxCost;
    @ApiCloudField(value="销售占比")
    private BigDecimal saleRate;
    @ApiCloudField(value="毛利金额")
    private BigDecimal profitMoney;
    @ApiCloudField(value="毛利金额")
    private BigDecimal profitNoTaxMoney;
    @ApiCloudField(value="毛利率")
    private BigDecimal profitRate;
    @ApiCloudField(value="毛利率")
    private BigDecimal profitNoTaxSaleRate;
    @ApiCloudField(value="不含税毛利率")
    private BigDecimal profitNotaxRate;
    @ApiCloudField(value="毛利占比")
    private BigDecimal profitTotalRate;
    @ApiCloudField(value="实际毛利金额")
    private BigDecimal profitRealMoney;
    @ApiCloudField(value="实际毛利率")
    private BigDecimal profitRealRate;
    @ApiCloudField(value="盈亏数量")
    private BigDecimal profitLossAmount;
    @ApiCloudField(value="盈亏金额")
    private BigDecimal profitLossMoney;
    @ApiCloudField(value="不含税额")
    private BigDecimal orderNoTaxMoney;
    @ApiCloudField(value="税额")
    private BigDecimal taxMoney;
    @ApiCloudField(value="配销毛利")
    private BigDecimal itemDifference;
    @ApiCloudField(value="配销毛利率")
    private BigDecimal itemDifferenceRate;
    @ApiCloudField(value="配送毛利占比")
    private BigDecimal itemDifferenceProRate;
    @ApiCloudField(value="分摊金额")
    private BigDecimal orderDetailShareDiscount;
    @ApiCloudField(value="促销返利金额")
    private BigDecimal policyMoney;
    @ApiCloudField(value="parent_cost")
    private BigDecimal parentCost;
    @ApiCloudField(value="商品赠送成本")
    private BigDecimal itemSendCost;
    @ApiCloudField(value="调整金额")
    private BigDecimal adjustmentMoney;
    @ApiCloudField(value="销售扣补金额")
    private BigDecimal saleRePaidMoney;
    @ApiCloudField(value="新增券售价分摊金额")
    private BigDecimal couponSaleShareDiscountMoney;
    @ApiCloudField(value="商品销售金额(不含券)")
    private BigDecimal saleMoneyNoCoupon;
    @ApiCloudField(value="商品销售毛利(不含券)")
    private BigDecimal profitMoneyNoCoupon;
    @ApiCloudField(value="商品销售毛利率(不含券)")
    private BigDecimal profitRateNoCoupon;
    @ApiCloudField(value="商品销售数量占比")
    private BigDecimal saleNumRate;
    @ApiCloudField(value="商品销售次数")
    private BigDecimal saleCount;
    @ApiCloudField(value="客单数")
    private BigDecimal customerNums;
    @ApiCloudField(value="商品折扣金额")
    private BigDecimal discount;
    @ApiCloudField(value="实时库存数量")
    private BigDecimal inventoryAmount;
    @ApiCloudField(value="店均客单数")
    private BigDecimal branchAvgCustomerNums;
    @ApiCloudField(value="损耗率")
    private BigDecimal lossRate;
    @ApiCloudField(value="unit_rate")
    private BigDecimal unitRate;
    @ApiCloudField(value="id")
    private String id;
    @ApiCloudField(value="顶级分类")
    private String topCategory;
    @ApiCloudField(value="销售天数")
    private BigDecimal saleDayNum;
    @ApiCloudField(value="商品销售金额(单据总额)")
    private BigDecimal orderMoney;
}
