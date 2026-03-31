package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProfitAnalysisItemGrossFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProfitAnalysisItemGrossFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="汇总条件")
    private List<String> summaryTypes;
    @ApiCloudField(value="开始时间")
    private String dtFrom;
    @ApiCloudField(value="结束时间")
    private String dtTo;
    @ApiCloudField(value="开始时间（时区转换）")
    private String dtFromChange;
    @ApiCloudField(value="结束时间（时区转换）")
    private String dtToChange;
    @ApiCloudField(value="dt_from_time")
    private String dtFromTime;
    @ApiCloudField(value="dt_to_time")
    private String dtToTime;
    @ApiCloudField(value="日期类型 调整时间/审核时间")
    private String dateType;
    @ApiCloudField(value="调整时间起")
    private String adjustDtFrom;
    @ApiCloudField(value="调整时间止")
    private String adjustDtTo;
    @ApiCloudField(value="分店")
    private List<Integer> branchNums;
    @ApiCloudField(value="配销门店")
    private List<Integer> centerBranchNums;
    @ApiCloudField(value="品牌")
    private List<String> brandCodes;
    @ApiCloudField(value="商品类别")
    private List<String> posItemTypeCodes;
    @ApiCloudField(value="商品")
    private List<Integer> posItemNums;
    @ApiCloudField(value="商品标签")
    private String itemLabelNums;
    @ApiCloudField(value="组合商品按成分统计")
    private Boolean isQueryCf;
    @ApiCloudField(value="仅统一组合商品剔除单卖")
    private Boolean isOnlyQueryCf;
    @ApiCloudField(value="按分级明细统计")
    private Boolean isQueryGrade;
    @ApiCloudField(value="部门")
    private String itemDepartments;
    @ApiCloudField(value="pos终端")
    private String orderMachine;
    @ApiCloudField(value="商品查询模板")
    private Integer itemFlagNum;
    @ApiCloudField(value="销售方式：微商城、实体店")
    private String saleType;
    @ApiCloudField(value="订单来源")
    private List<String> orderSources;
    @ApiCloudField(value="是否线上")
    private Boolean queryOffline;
    @ApiCloudField(value="经营方式")
    private List<String> managementStyles;
    @ApiCloudField(value="计量单位")
    private String unitType;
    @ApiCloudField(value="two_string_value_datas")
    private List<TwoStringValueDataModel> twoStringValueDatas;
    @ApiCloudField(value="查询项扩展属性")
    private Boolean queryItemExtendAttribute;
    @ApiCloudField(value="采购员用户编号")
    private Integer appUserNum;
    @ApiCloudField(value="商户编号")
    private Integer merchantNum;
    @ApiCloudField(value="绑定的摊位编号")
    private Integer stallNum;
    @ApiCloudField(value="是否促销")
    private Boolean isPolicy;
    @ApiCloudField(value="导出id")
    private String exportId;
    @ApiCloudField(value="0顶级 1二级 -1当前类别")
    private Integer deepIndex;
    @ApiCloudField(value="query_sale_branch_count")
    private Boolean querySaleBranchCount;
    @ApiCloudField(value="客户主键")
    private String clientFid;
    @ApiCloudField(value="客户主键多选")
    private List<String> clientFids;
    @ApiCloudField(value="是否启用税率")
    private Boolean enableTax;
    @ApiCloudField(value="是否启用日结参数")
    private Boolean enableStockCarry;
    @ApiCloudField(value="是否查询券分摊金额")
    private Boolean enableCouponSaleShareDiscount;
    @ApiCloudField(value="是否为商超")
    private Boolean isMarket;
    @ApiCloudField(value="查询分摊金额")
    private Boolean isShareDiscount;
    @ApiCloudField(value="查询进度id 可随机生成不重复就行")
    private String queryPercentId;
    @ApiCloudField(value="查询id")
    private String queryId;
    @ApiCloudField(value="是否查询赠送成本")
    private Boolean enableSendCost;
    @ApiCloudField(value="enable_avg_item_generate_adj_money")
    private Boolean enableAvgItemGenerateAdjMoney;
    @ApiCloudField(value="券标记")
    private List<String> couponTypes;
    @ApiCloudField(value="是否过滤赠品")
    private Boolean filterGift;
    @ApiCloudField(value="是否过滤非库存商品")
    private Boolean filterNotInventory;
    @ApiCloudField(value="是否查询商品销售天数  默认false")
    private Boolean searchSaleDayNum;
    @ApiCloudField(value="是否查询客单数  默认false")
    private Boolean searchCustomerNum;
    @ApiCloudField(value="仅查询有会员手机号的单据")
    private Boolean customer;
    @ApiCloudField(value="是否显示商品销售金额(单据总额)")
    private Boolean showOrderMoney;
    @ApiCloudField(value="过滤无销售数据商品")
    private Boolean filterSaleItem;
    @ApiCloudField(value="是否查询实时库存")
    private Boolean queryInventory;
    @ApiCloudField(value="是否查询用户渠道范围内部调用传true")
    private Boolean serviceLink;
    @ApiCloudField(value="销售渠道(1->线下 2->线上-微商城V2 3->线上-订单聚合 )")
    private List<Integer> orderSaleChannels;
    @ApiCloudField(value="订单销售类型")
    private List<Integer> orderSaleTypes;
    @ApiCloudField(value="查询权限")
    private List<String> privileges;
    @ApiCloudField(value="adjustment")
    private Boolean adjustment;
}
