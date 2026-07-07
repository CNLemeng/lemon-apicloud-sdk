package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleItemSpecVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleItemSpecVOModel extends ApiCloudObject {

    @ApiCloudField(value="bar_code")
    private String barCode;
    @ApiCloudField(value="convert_rate", example="1.0")
    private BigDecimal convertRate;
    @ApiCloudField(value="created_at", example="2026-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="created_by", example="996750001")
    private Long createdBy;
    @ApiCloudField(value="deleted_flag", example="true")
    private Boolean deletedFlag;
    @ApiCloudField(value="float_rate_enable", example="true")
    private Boolean floatRateEnable;
    @ApiCloudField(value="independent_price_enable", example="true")
    private Boolean independentPriceEnable;
    @ApiCloudField(value="item_num", example="1")
    private Integer itemNum;
    @ApiCloudField(value="main_spec_flag", example="true")
    private Boolean mainSpecFlag;
    @ApiCloudField(value="scene_list")
    private String sceneList;
    @ApiCloudField(value="spec_code", example="A00001")
    private String specCode;
    @ApiCloudField(value="spec_multiple", example="1.0")
    private BigDecimal specMultiple;
    @ApiCloudField(value="spec_name", example="可口可乐")
    private String specName;
    @ApiCloudField(value="spec_num", example="9967500001")
    private Long specNum;
    @ApiCloudField(value="spec_offset_qty", example="1.0")
    private BigDecimal specOffsetQty;
    @ApiCloudField(value="spec_pinyin", example="KKKL")
    private String specPinyin;
    @ApiCloudField(value="spec_regular_price", example="1.0")
    private BigDecimal specRegularPrice;
    @ApiCloudField(value="spec_unit_id", example="1")
    private Long specUnitId;
    @ApiCloudField(value="spec_unit_name", example="公斤")
    private String specUnitName;
    @ApiCloudField(value="spec_upper_limit", example="5.0")
    private BigDecimal specUpperLimit;
    @ApiCloudField(value="spec_wholesale_price", example="5.0")
    private BigDecimal specWholesalePrice;
    @ApiCloudField(value="un_allow_return", example="true")
    private Boolean unAllowReturn;
    @ApiCloudField(value="updated_at", example="2026-01-01 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="updated_by", example="996750001")
    private Long updatedBy;
    @ApiCloudField(value="weight_flag", example="true")
    private Boolean weightFlag;
    @ApiCloudField(value="wholesale_enable", example="true")
    private Boolean wholesaleEnable;
    @ApiCloudField(value="wholesale_sale_enable", example="true")
    private Boolean wholesaleSaleEnable;
    @ApiCloudField(value="spec_grade_prices")
    private List<WholesaleSpecGradePriceModel> specGradePrices;
}
