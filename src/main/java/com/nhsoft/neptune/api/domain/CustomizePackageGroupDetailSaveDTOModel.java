package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageGroupDetailSaveDTO模型
 * 分组明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageGroupDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="117", required=true)
    private Integer itemNum;
    @ApiCloudField(value="分级商品编码", example="1")
    private Integer itemGradeNum;
    @ApiCloudField(value="商品规格编码", example="1001")
    private Long specNum;
    @ApiCloudField(value="商品套餐价，套餐类型为 ITEM 时必填", example="10.0")
    private BigDecimal packagePrice;
    @ApiCloudField(value="扣库存数量，仅称重品允许填写", example="1.0")
    private BigDecimal itemInventoryQuantity;
    @ApiCloudField(value="允许超重数量", example="0.1")
    private BigDecimal overWeightDeviationQuantity;
}
