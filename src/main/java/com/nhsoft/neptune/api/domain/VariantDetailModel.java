package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * VariantDetail模型
 * 线上规格兑换配置
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VariantDetailModel extends ApiCloudObject {

    @ApiCloudField(value="线上规格 ID", required=true)
    private Long variantId;
    @ApiCloudField(value="单规格兑换数量限制")
    private Integer singleVariantExchangeLimit;
}
