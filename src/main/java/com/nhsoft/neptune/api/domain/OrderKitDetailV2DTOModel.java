package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderKitDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderKitDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="主键")
    private String orderKitDetailFid;
    @ApiCloudField(value="单据类型")
    private String orderType;
    @ApiCloudField(value="单据单号")
    private String orderFid;
    @ApiCloudField(value="原商品编码")
    private Integer itemNum;
    @ApiCloudField(value="库存商品编码")
    private Integer kitItemNum;
    @ApiCloudField(value="门店编码")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码")
    private Integer storehouseNum;
    @ApiCloudField(value="单据时间")
    private String orderTime;
    @ApiCloudField(value="单据时间")
    private String itemCode;
    @ApiCloudField(value="商品名称")
    private String itemName;
    @ApiCloudField(value="原商品数量")
    private BigDecimal itemAmount;
    @ApiCloudField(value="库存商品代码")
    private String kitItemCode;
    @ApiCloudField(value="库存商品名称")
    private String kitItemName;
    @ApiCloudField(value="库存商品数量")
    private BigDecimal kitItemAmount;
    @ApiCloudField(value="库存商品单价")
    private BigDecimal kitItemPrice;
    @ApiCloudField(value="库存商品金额")
    private BigDecimal kitItemMoney;
    @ApiCloudField(value="原商品单位")
    private String itemUnit;
    @ApiCloudField(value="库存商品单位")
    private String kitItemUnit;
}
