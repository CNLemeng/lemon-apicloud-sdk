package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCategoriedVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCategoriedVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="9965800000019")
    private Long id;
    @ApiCloudField(value="recommand", example="true")
    private Boolean recommand;
    @ApiCloudField(value="kind", example="MONTH")
    private String kind;
    @ApiCloudField(value="real_price", example="1000")
    private Integer realPrice;
    @ApiCloudField(value="show_price", example="1000")
    private Integer showPrice;
    @ApiCloudField(value="续费价(单位:分)", example="100")
    private Integer renewalPrice;
    @ApiCloudField(value="复购价(单位:分)", example="100")
    private Integer repurchasePrice;
    @ApiCloudField(value="days", example="1")
    private Integer days;
    @ApiCloudField(value="supplementary_card_switch", example="true")
    private Boolean supplementaryCardSwitch;
    @ApiCloudField(value="supplementary_card_count", example="1")
    private Integer supplementaryCardCount;
    @ApiCloudField(value="card_category_name")
    private String cardCategoryName;
    @ApiCloudField(value="price_type", example="DEFAULT")
    private String priceType;
}
