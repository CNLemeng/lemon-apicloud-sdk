package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageGroupDetailVO模型
 * 分组明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageGroupDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="分组编号", example="1")
    private Integer groupNum;
    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编号", example="117")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编码", example="1")
    private Integer itemGradeNum;
    @ApiCloudField(value="套餐价", example="1.0")
    private BigDecimal packagePrice;
    @ApiCloudField(value="扣库存数量", example="1.0")
    private BigDecimal itemInventoryQuantity;
    @ApiCloudField(value="允许超重数量", example="1.0")
    private BigDecimal overWeightDeviationQuantity;
}
