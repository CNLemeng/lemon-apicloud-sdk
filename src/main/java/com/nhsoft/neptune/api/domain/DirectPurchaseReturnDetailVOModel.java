package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseReturnDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseReturnDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="150050001")
    private Integer itemNum;
    @ApiCloudField(value="常用数量（小数点3位）", example="1.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="采购单价（小数点4位）", example="1.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="采购单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品换算率（小数点3位）", example="1.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="商品代码", example="10001")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="采购金额（小数点2位）", example="1.0")
    private BigDecimal itemMoney;
    @ApiCloudField(value="运费金额", example="10.0")
    private BigDecimal itemFeeMoney;
    @ApiCloudField(value="配送单价（小数点4位）", example="1.0")
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="不含税金额（小数点2位）", example="1.0")
    private BigDecimal itemNoTaxMoney;
    @ApiCloudField(value="税额（小数点2位）", example="1.0")
    private BigDecimal itemTaxMoney;
    @ApiCloudField(value="成本金额（小数点2位）", example="1.0")
    private BigDecimal detailSubTotal;
    @ApiCloudField(value="税率", example="0.03")
    private BigDecimal itemTaxRate;
    @ApiCloudField(value="生产日期", example="Fri Jan 01 08:00:00 CST 2021")
    private String itemProducingDate;
    @ApiCloudField(value="批次号", example="")
    private String itemLotNumber;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="退货数量")
    private BigDecimal itemBranchReturnUseQty;
    @ApiCloudField(value="退货基本数量")
    private BigDecimal itemBranchReturnQty;
    @ApiCloudField(value="退货赠送常用数量")
    private BigDecimal itemBranchPresentUseQty;
    @ApiCloudField(value="退货赠送基本数量")
    private BigDecimal itemBranchPresentQty;
    @ApiCloudField(value="确认退货数量")
    private BigDecimal itemConfirmReturnUseQty;
    @ApiCloudField(value="确认退货基本数量")
    private BigDecimal itemConfirmReturnQty;
    @ApiCloudField(value="确认退货赠送常用数量")
    private BigDecimal itemConfirmPresentUseQty;
    @ApiCloudField(value="确认退货赠送基本数量")
    private BigDecimal itemConfirmPresentQty;
    @ApiCloudField(value="退货金额")
    private BigDecimal itemBranchReturnMoney;
}
