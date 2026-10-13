package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsInventoryLnAttributeVO模型
 * 商品批次属性
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsInventoryLnAttributeVOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编号")
    private Integer storehouseNum;
    @ApiCloudField(value="商品系统编号")
    private Integer itemNum;
    @ApiCloudField(value="批次号")
    private String inventoryLnAttributeLotNumber;
    @ApiCloudField(value="账套编码")
    private String systemBookCode;
    @ApiCloudField(value="批次规则")
    private String inventoryLnAttributeRule;
    @ApiCloudField(value="产地类型，如国内或国外")
    private String inventoryLnAttributeOrigin;
    @ApiCloudField(value="产地地区")
    private String inventoryLnAttributeOriginPlace;
    @ApiCloudField(value="产地城市")
    private String inventoryLnAttributeOriginCity;
    @ApiCloudField(value="果径")
    private String inventoryLnAttributeFruitSize;
    @ApiCloudField(value="糖度")
    private String inventoryLnAttributeBrix;
    @ApiCloudField(value="单果重")
    private String inventoryLnAttributeFruitWeight;
    @ApiCloudField(value="批次属性最后更新时间")
    private String inventoryLnAttributeLastEditTime;
}
