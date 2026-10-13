package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemExpirationFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemExpirationFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="date_type", example="生产日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", required=true)
    private String dateTo;
    @ApiCloudField(value="门店编号")
    private List<Integer> branchNums;
    @ApiCloudField(value="商品编号")
    private List<Integer> itemNums;
    @ApiCloudField(value="商品分类")
    private List<String> itemCategorys;
    @ApiCloudField(value="商品部门")
    private List<String> itemDepartments;
    @ApiCloudField(value="商品标签")
    private List<Integer> itemLabelNums;
    @ApiCloudField(value="商品关键字")
    private String itemKeyword;
    @ApiCloudField(value="是否有库存")
    private Boolean itemHasInventory;
    @ApiCloudField(value="保质期标签")
    private List<String> itemExpirationLabels;
    @ApiCloudField(value="查询页码，从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="分页数量，最大2000", example="20", required=true)
    private Integer pageSize;
}
