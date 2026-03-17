package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemFlagVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemFlagVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品查询模板编号", example="1")
    private Integer itemFlagNum;
    @ApiCloudField(value="商品模板查询名称", example="23")
    private String itemFlagName;
    @ApiCloudField(value="查询模板类型(查询模板|条码秤模板)", example="查询模板")
    private String itemFlagType;
    @ApiCloudField(value="应用门店编号列表", example="[1]")
    private List<Integer> branchNums;
    @ApiCloudField(value="查询模板范围(指定商品|指定类别)", example="指定商品")
    private String itemFlagScope;
    @ApiCloudField(value="最后修改时间", example="2026-01-01 00:00:00")
    private String itemFlagLastEditTime;
}
