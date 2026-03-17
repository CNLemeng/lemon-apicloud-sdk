package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemFlagFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemFlagFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="所属门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="应用门店编号列表", example="[1,2]")
    private List<Integer> branchNums;
    @ApiCloudField(value="查询模板类型(查询模板|条码秤模板)", example="查询模板")
    private String itemFlagType;
    @ApiCloudField(value="查询模板范围(指定商品|指定类别)", example="指定商品")
    private String itemFlagScope;
    @ApiCloudField(value="关键字查询", example="a")
    private String keyword;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="分页大小(最大为200)", example="100", required=true)
    private Integer pageSize;
    @ApiCloudField(value="最后修改时间", example="2026-01-01 00:00:00")
    private String itemFlagLastEditTime;
}
