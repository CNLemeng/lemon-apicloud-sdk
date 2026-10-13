package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseItemSpecUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseItemSpecUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="spec_num", example="996750001", required=true)
    private Long specNum;
    @ApiCloudField(value="bar_code", example="A5220011")
    private String barCode;
    @ApiCloudField(value="barcode_scale_label_num", example="5220011")
    private String barcodeScaleLabelNum;
    @ApiCloudField(value="convert_rate", example="1.0")
    private BigDecimal convertRate;
    @ApiCloudField(value="custom_sort", example="1")
    private Integer customSort;
    @ApiCloudField(value="item_grade_change_price_flag", example="true")
    private Boolean itemGradeChangePriceFlag;
    @ApiCloudField(value="item_grade_discounted", example="true")
    private Boolean itemGradeDiscounted;
    @ApiCloudField(value="item_grade_regular_price", example="10.0")
    private BigDecimal itemGradeRegularPrice;
    @ApiCloudField(value="item_grade_level2_price", example="10.0")
    private BigDecimal itemGradeLevel2Price;
    @ApiCloudField(value="item_grade_level3_price", example="10.0")
    private BigDecimal itemGradeLevel3Price;
    @ApiCloudField(value="item_grade_level4_price", example="10.0")
    private BigDecimal itemGradeLevel4Price;
    @ApiCloudField(value="item_grade_max_price", example="15.0")
    private BigDecimal itemGradeMaxPrice;
    @ApiCloudField(value="item_grade_min_price", example="5.0")
    private BigDecimal itemGradeMinPrice;
    @ApiCloudField(value="item_grade_non_fixed_weight", example="true")
    private Boolean itemGradeNonFixedWeight;
    @ApiCloudField(value="item_grade_package_actived", example="true")
    private Boolean itemGradePackageActived;
    @ApiCloudField(value="item_grade_point_actived", example="true")
    private Boolean itemGradePointActived;
    @ApiCloudField(value="item_grade_sale_cease_flag", example="true")
    private Boolean itemGradeSaleCeaseFlag;
    @ApiCloudField(value="weight_flag", example="true")
    private Boolean weightFlag;
    @ApiCloudField(value="memo", example="A0001")
    private String memo;
    @ApiCloudField(value="online_spec_name", example="可口可乐")
    private String onlineSpecName;
    @ApiCloudField(value="应用范围（ONLINE, OFFLINE, WHOLESALE）", example="ONLINE")
    private List<String> sceneList;
    @ApiCloudField(value="spec_alias", example="可口可乐")
    private String specAlias;
    @ApiCloudField(value="spec_code", example="9921001")
    private String specCode;
    @ApiCloudField(value="spec_name", example="可口可乐(1箱*24瓶)")
    private String specName;
    @ApiCloudField(value="spec_pinyin", example="KOKL")
    private String specPinyin;
    @ApiCloudField(value="spec_point_value", example="10")
    private Integer specPointValue;
    @ApiCloudField(value="spec_unit_name", example="箱")
    private String specUnitName;
}
