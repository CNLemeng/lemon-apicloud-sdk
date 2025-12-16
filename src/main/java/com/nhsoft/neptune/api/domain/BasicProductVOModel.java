package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicProductVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicProductVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1")
    private Long id;
    @ApiCloudField(value="商品名称", example="乐事薯片")
    private String name;
    @ApiCloudField(value="商品描述", example="乐事薯片")
    private String description;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enable;
    @ApiCloudField(value="商品图片", example="")
    private List<BasicResourceVOModel> images;
    @ApiCloudField(value="video")
    private BasicResourceVOModel video;
    @ApiCloudField(value="param")
    private BasicProductParamVOModel param;
    @ApiCloudField(value="商品分类", example="1")
    private Long categoryId;
    @ApiCloudField(value="品牌", example="可口可乐")
    private String brand;
    @ApiCloudField(value="品牌ID", example="1")
    private Long brandId;
    @ApiCloudField(value="单位", example="盒")
    private String basicUnit;
    @ApiCloudField(value="单位ID", example="1")
    private Long basicUnitId;
    @ApiCloudField(value="保质期", example="1")
    private Long shelfLife;
    @ApiCloudField(value="是否删除", example="true")
    private Boolean deleteFlag;
    @ApiCloudField(value="是否称重", example="true")
    private Boolean weightingFlag;
    @ApiCloudField(value="商品代码", example="AX0001")
    private String code;
    @ApiCloudField(value="商品条码", example="922000110")
    private String barcode;
    @ApiCloudField(value="创建时间")
    private String createdAt;
    @ApiCloudField(value="更新时间")
    private String updatedAt;
    @ApiCloudField(value="商品规格", example="")
    private List<BasicVariantVOModel> variants;
    @ApiCloudField(value="最低售价", example="1.0")
    private BigDecimal minStdPrice;
    @ApiCloudField(value="最高售价", example="1.0")
    private BigDecimal maxStdPrice;
    @ApiCloudField(value="最低2级售价", example="1.0")
    private BigDecimal minLevel2Price;
    @ApiCloudField(value="最高2级售价", example="1.0")
    private BigDecimal maxLevel2Price;
    @ApiCloudField(value="最低3级售价", example="1.0")
    private BigDecimal minLevel3Price;
    @ApiCloudField(value="最高3级售价", example="1.0")
    private BigDecimal maxLevel3Price;
    @ApiCloudField(value="最低4级售价", example="1.0")
    private BigDecimal minLevel4Price;
    @ApiCloudField(value="最高4级售价", example="1.0")
    private BigDecimal maxLevel4Price;
    @ApiCloudField(value="最低划线价", example="1.0")
    private BigDecimal minLiningPrice;
    @ApiCloudField(value="最高划线价", example="1.0")
    private BigDecimal maxLiningPrice;
    @ApiCloudField(value="是否同步门店库存", example="true")
    private Boolean syncInventory;
    @ApiCloudField(value="安全库存", example="1")
    private Long safeInventory;
    @ApiCloudField(value="商品分组信息", example="")
    private List<BasicProductGroupDTOModel> groups;
    @ApiCloudField(value="商品销量", example="1")
    private Long soldAmount;
    @ApiCloudField(value="是否停售", example="true")
    private Boolean stopSale;
}
