package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicProductFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicProductFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品属性ID", example="1")
    private Long attributeId;
    @ApiCloudField(value="是否自动上架", example="true")
    private Boolean autoOnSale;
    @ApiCloudField(value="商品条码", example="922000110")
    private String barcode;
    @ApiCloudField(value="商品分类ID列表", example="[1]")
    private List<Long> categoryIds;
    @ApiCloudField(value="商品代码", example="AX0001")
    private String code;
    @ApiCloudField(value="是否删除", example="true")
    private Boolean deleteFlag;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enable;
    @ApiCloudField(value="是否允许负库存", example="true")
    private Boolean enableNegativeInventory;
    @ApiCloudField(value="商品分组ID", example="1")
    private Long groupId;
    @ApiCloudField(value="商品ID(支持多商品，逗号分开)", example="1")
    private String id;
    @ApiCloudField(value="外部商品名称 商品规格值 商品条码", example="乐事薯片")
    private String itemNameOrCodeOrBarcode;
    @ApiCloudField(value="商品标签ID", example="1")
    private Long labelId;
    @ApiCloudField(value="是否手工指定商品", example="true")
    private Boolean manual;
    @ApiCloudField(value="商品名称", example="乐事薯片")
    private String name;
    @ApiCloudField(value="是否查询销量 不传默认查询", example="true")
    private Boolean querySoldAmount;
    @ApiCloudField(value="是否允许自提", example="true")
    private Boolean selfPickDays;
    @ApiCloudField(value="商品分组只查询 本分组的商品", example="true")
    private Boolean simpleGroup;
    @ApiCloudField(value="是否停售", example="true")
    private Boolean stopSale;
    @ApiCloudField(value="是否同步库存", example="true")
    private Boolean syncInventory;
    @ApiCloudField(value="商品规格ID列表", example="[1]")
    private List<Long> variantIds;
    @ApiCloudField(value="商品规格是否同步库存", example="true")
    private Boolean variantInventory;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小， 最大200", example="100", required=true)
    private Integer pageSize;
}
