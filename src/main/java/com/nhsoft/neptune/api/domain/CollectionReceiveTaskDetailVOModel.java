package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CollectionReceiveTaskDetailVO模型
 * 采配收货任务明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CollectionReceiveTaskDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="收货任务单号")
    private String receiveTaskFid;
    @ApiCloudField(value="收货明细序号")
    private Integer receiveTaskDetailNum;
    @ApiCloudField(value="账套编码")
    private String systemBookCode;
    @ApiCloudField(value="收货门店编号")
    private Integer dcBranchNum;
    @ApiCloudField(value="供应商编号")
    private Integer receiveTaskDetailSupplierNum;
    @ApiCloudField(value="供应商名称")
    private String receiveTaskDetailSupplierName;
    @ApiCloudField(value="商品系统编号")
    private Integer receiveTaskDetailItemNum;
    @ApiCloudField(value="商品代码")
    private String receiveTaskDetailItemCode;
    @ApiCloudField(value="商品名称")
    private String receiveTaskDetailItemName;
    @ApiCloudField(value="商品规格")
    private String receiveTaskDetailItemSpec;
    @ApiCloudField(value="常用单位")
    private String receiveTaskDetailUseUnit;
    @ApiCloudField(value="收货常用数量")
    private BigDecimal receiveTaskDetailUseQty;
    @ApiCloudField(value="常用单位换算率")
    private BigDecimal receiveTaskDetailUseRate;
    @ApiCloudField(value="基本单位")
    private String receiveTaskDetailBaseUnit;
    @ApiCloudField(value="收货基本数量")
    private BigDecimal receiveTaskDetailBaseQty;
    @ApiCloudField(value="赠品单位")
    private String receiveTaskDetailPresentUnit;
    @ApiCloudField(value="赠品数量")
    private BigDecimal receiveTaskDetailPresentQty;
    @ApiCloudField(value="单位皮重")
    private BigDecimal receiveTaskDetailPerTare;
    @ApiCloudField(value="常用单位单价")
    private BigDecimal receiveTaskDetailUsePrice;
    @ApiCloudField(value="基本单位单价")
    private BigDecimal receiveTaskDetailBasePrice;
    @ApiCloudField(value="收货金额")
    private BigDecimal receiveTaskDetailTotalMoney;
    @ApiCloudField(value="批次号")
    private String receiveTaskDetailLotNum;
    @ApiCloudField(value="收货仓库编号")
    private Integer receiveTaskDetailToStorehouseNum;
    @ApiCloudField(value="收货仓库名称")
    private String receiveTaskDetailToStorehouseName;
    @ApiCloudField(value="收货时间")
    private String receiveTaskDetailReceiveTime;
    @ApiCloudField(value="收货明细备注")
    private String receiveTaskDetailMemo;
    @ApiCloudField(value="筐价格")
    private BigDecimal receiveTaskDetailBasketPrice;
    @ApiCloudField(value="建议配送价")
    private BigDecimal receiveTaskDetailAdviseTransportPrice;
    @ApiCloudField(value="采购任务单号")
    private String purchaseTaskFid;
    @ApiCloudField(value="采购任务明细序号")
    private Integer purchaseTaskDetailNum;
    @ApiCloudField(value="建议零售价")
    private BigDecimal receiveTaskDetailAdviseSalePrice;
    @ApiCloudField(value="出库单号")
    private String outOrderFid;
    @ApiCloudField(value="出库明细序号")
    private Integer outOrderDetailNum;
    @ApiCloudField(value="供应商运费")
    private BigDecimal receiveTaskDetailSupplierMoney;
    @ApiCloudField(value="明细完成时间")
    private String receiveTaskDetailCompleteTime;
    @ApiCloudField(value="明细完成人")
    private String receiveTaskDetailCompleteUser;
    @ApiCloudField(value="生产日期")
    private String receiveTaskDetailProductionDate;
    @ApiCloudField(value="明细采配日")
    private String receiveTaskDetailBizday;
    @ApiCloudField(value="最后配送价")
    private BigDecimal lastTransforPrice;
    @ApiCloudField(value="预约时间")
    private String appoinTime;
    @ApiCloudField(value="收货赠送常用数量")
    private BigDecimal receiveTaskDetailPresentUseQty;
    @ApiCloudField(value="收货赠送基本数量")
    private BigDecimal receiveTaskDetailPresentBaseQty;
    @ApiCloudField(value="商品库位")
    private String positionNameSplic;
    @ApiCloudField(value="配送单位")
    private String transferUnit;
    @ApiCloudField(value="采购常用数量")
    private BigDecimal purchaseUseQty;
    @ApiCloudField(value="采购基本数量")
    private BigDecimal purchaseBaseQty;
    @ApiCloudField(value="商品条码")
    private String itemBarCode;
    @ApiCloudField(value="商品类别名称")
    private String itemCategoryName;
    @ApiCloudField(value="收货状态")
    private String receiveTaskStateName;
    @ApiCloudField(value="配送毛利率")
    private BigDecimal receiveTaseDetailGrossRate;
    @ApiCloudField(value="明细唯一标识")
    private String uuid;
    @ApiCloudField(value="商品有效期天数")
    private Integer itemValidPeriod;
    @ApiCloudField(value="仓库地址")
    private String storehouseAddr;
}
