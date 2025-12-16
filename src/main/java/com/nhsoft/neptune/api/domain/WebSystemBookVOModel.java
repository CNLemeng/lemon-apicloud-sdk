package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WebSystemBookVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WebSystemBookVOModel extends ApiCloudObject {

    @ApiCloudField(value="业务单据主键根据日期生成", example="true")
    private Boolean orderFidGenerateByDate;
    @ApiCloudField(value="开启库存成本结转功能", example="true")
    private Boolean enableStockCarry;
    @ApiCloudField(value="库存结转初始日期", example="2025-12-17 11:15:03")
    private String stockCarryInitDate;
    @ApiCloudField(value="业务系统启用进销税项", example="true")
    private Boolean enableTax;
    @ApiCloudField(value="小规模纳税人税率", example="0.03")
    private BigDecimal smallTaxpayerTax;
    @ApiCloudField(value="启用异常成本价校正", example="true")
    private Boolean enableCostPriceCheck;
    @ApiCloudField(value="异常成本价参数1", example="1")
    private BigDecimal costPriceValue1;
    @ApiCloudField(value="异常成本价参数2", example="2")
    private BigDecimal costPriceValue2;
    @ApiCloudField(value="联营商品按销售金额扣点", example="true")
    private Boolean shopItemByPayMoney;
    @ApiCloudField(value="联营商品按含税金额扣点", example="true")
    private Boolean shopItemByTaxPayMoney;
    @ApiCloudField(value="组合商品库存同步水星", example="true")
    private Boolean enableSynKitPosItem;
    @ApiCloudField(value="业务单据允许录入规格明细商品", example="true")
    private Boolean enableInputGradeItem;
    @ApiCloudField(value="开启成本结转，业务单据放开单价限制", example="true")
    private Boolean enableStockCarryCostPriceLimit;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联", example="true")
    private Boolean enableWmsWeakCoupling;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联-收货单", example="true")
    private Boolean couplingReceiveOrder;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联-退货单", example="true")
    private Boolean couplingReturnOrder;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联-调出单", example="true")
    private Boolean couplingOutOrder;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联-调入单", example="true")
    private Boolean couplingInOrder;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联-批发销售单", example="true")
    private Boolean couplingWholesaleOrder;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联-批发退货单", example="true")
    private Boolean couplingWholesaleReturnOrder;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联-库存调整单", example="true")
    private Boolean couplingAdjustmentOrder;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联-库存转仓单", example="true")
    private Boolean couplingAllocationOrder;
    @ApiCloudField(value="启用进销存单据和标品WMS弱关联-组合拆分单", example="true")
    private Boolean couplingAssembleSplitOrder;
    @ApiCloudField(value="可售天数＞保质期*N%不允许登录中的N", example="66.67")
    private BigDecimal expiryMonitorFactor;
    @ApiCloudField(value="图片大小上限(KB)", example="1024")
    private BigDecimal webSystemPictureSize;
    @ApiCloudField(value="往来账款限制日期", example="2025-12-17 11:15:03")
    private String webSystemCloseBillDate;
}
