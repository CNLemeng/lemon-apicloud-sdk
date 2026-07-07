package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleSpecGradePrice模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleSpecGradePriceModel extends ApiCloudObject {

    @ApiCloudField(value="grade_name")
    private String gradeName;
    @ApiCloudField(value="grade_num", example="1")
    private Integer gradeNum;
    @ApiCloudField(value="item_client_grade_nosale_case", example="true")
    private Boolean itemClientGradeNosaleCase;
    @ApiCloudField(value="item_client_gross_type", example="1")
    private Integer itemClientGrossType;
    @ApiCloudField(value="item_client_gross_value", example="1.0")
    private BigDecimal itemClientGrossValue;
    @ApiCloudField(value="item_num", example="1")
    private Integer itemNum;
    @ApiCloudField(value="lock_gross_value", example="true")
    private Boolean lockGrossValue;
    @ApiCloudField(value="pos_item_regular_price", example="1.0")
    private BigDecimal posItemRegularPrice;
    @ApiCloudField(value="price", example="1.0")
    private BigDecimal price;
    @ApiCloudField(value="spec_num", example="9967500001")
    private Long specNum;
}
