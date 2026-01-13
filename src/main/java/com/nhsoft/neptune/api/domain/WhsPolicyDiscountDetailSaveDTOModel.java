package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsPolicyDiscountDetailSaveDTO模型
 * 折扣明细列表(当折扣类型为指定品牌、指定类别、全场时，该字段为例外商品)
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsPolicyDiscountDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品规格单位", example="公斤", required=true)
    private String specUnit;
    @ApiCloudField(value="商品备注", example="备注")
    private String wholesalePolicyDiscountDetailMemo;
}
