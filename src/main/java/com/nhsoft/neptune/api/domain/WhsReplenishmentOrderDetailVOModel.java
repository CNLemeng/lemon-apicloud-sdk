package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsReplenishmentOrderDetailVO模型
 * 明细列表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsReplenishmentOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编号", example="1")
    private Integer itemNum;
    @ApiCloudField(value="商品规格编号", example="109900000024")
    private Long specNum;
    @ApiCloudField(value="商品代码", example="10001")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="测试")
    private String itemName;
    @ApiCloudField(value="商品条码", example="12310001")
    private String itemBarcode;
    @ApiCloudField(value="商品规格单位", example="个")
    private String itemSpecUnit;
    @ApiCloudField(value="销售价", example="100.0")
    private BigDecimal salePrice;
    @ApiCloudField(value="补货单价", example="100.0")
    private BigDecimal replenishmentPrice;
    @ApiCloudField(value="补货数量", example="1.0")
    private BigDecimal replenishmentQty;
    @ApiCloudField(value="补货金额", example="100.0")
    private BigDecimal replenishmentMoney;
    @ApiCloudField(value="税额", example="0.0")
    private BigDecimal taxMoney;
    @ApiCloudField(value="税率", example="0.0")
    private BigDecimal taxRate;
    @ApiCloudField(value="备注", example="测试")
    private String memo;
    @ApiCloudField(value="批次号", example="2023-01-01")
    private String lotNumber;
}
