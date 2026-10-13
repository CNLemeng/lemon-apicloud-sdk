package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemRealPriceVO模型
 * 门店商品的设定价格、最终应用价格及商品规格信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemRealPriceVOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="1")
    private Integer branchNum;
    @ApiCloudField(value="item_num", example="2307")
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num", example="1194")
    private Integer itemGradeNum;
    @ApiCloudField(value="last_edit_time", example="2026-07-28 11:50:30")
    private String lastEditTime;
    @ApiCloudField(value="门店维度设置的标准售价；0表示未单独设置", example="8.88")
    private BigDecimal branchItemRegularPrice;
    @ApiCloudField(value="门店维度设置的二级售价；0表示未单独设置", example="0.0")
    private BigDecimal branchItemLevel2Price;
    @ApiCloudField(value="门店维度设置的三级售价；0表示未单独设置", example="0.0")
    private BigDecimal branchItemLevel3Price;
    @ApiCloudField(value="门店维度设置的四级售价；0表示未单独设置", example="0.0")
    private BigDecimal branchItemLevel4Price;
    @ApiCloudField(value="门店维度设置的最高售价；0表示未单独设置", example="40.0")
    private BigDecimal branchItemMaxPrice;
    @ApiCloudField(value="门店维度设置的最低售价；0表示未单独设置", example="0.0")
    private BigDecimal branchItemMinPrice;
    @ApiCloudField(value="按门店价格启用状态、门店设定价、规格价和商品档案价计算后的实际标准售价", example="8.88")
    private BigDecimal branchItemRegularRealPrice;
    @ApiCloudField(value="门店二级售价未设置时，按门店标准售价、规格价或商品档案价依次回退", example="8.88")
    private BigDecimal branchItemLevel2RealPrice;
    @ApiCloudField(value="门店三级售价未设置时，按门店标准售价、规格价或商品档案价依次回退", example="8.88")
    private BigDecimal branchItemLevel3RealPrice;
    @ApiCloudField(value="门店四级售价未设置时，按门店标准售价、规格价或商品档案价依次回退", example="8.88")
    private BigDecimal branchItemLevel4RealPrice;
    @ApiCloudField(value="门店价格启用时采用门店或商品档案最高售价；未启用时可为空", example="40.0")
    private BigDecimal branchItemMaxRealPrice;
    @ApiCloudField(value="门店价格启用时采用门店或商品档案最低售价；未启用时可为空", example="0.0")
    private BigDecimal branchItemMinRealPrice;
}
