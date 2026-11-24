package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemGradeDetail模型
 * 线下分级商品兑换配置
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemGradeDetailModel extends ApiCloudObject {

    @ApiCloudField(value="线下分级商品 ID", required=true)
    private Integer itemGradeNum;
    @ApiCloudField(value="商品中心规格 ID")
    private Long specNum;
    @ApiCloudField(value="单分级商品兑换数量限制")
    private Integer singleItemGradeExchangeLimit;
}
