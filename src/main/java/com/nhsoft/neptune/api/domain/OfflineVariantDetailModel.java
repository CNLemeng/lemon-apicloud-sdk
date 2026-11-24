package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OfflineVariantDetail模型
 * 线下商品中心规格兑换配置（请求）
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OfflineVariantDetailModel extends ApiCloudObject {

    @ApiCloudField(value="商品中心规格 ID", required=true)
    private Long specNum;
    @ApiCloudField(value="单规格兑换数量限制")
    private Integer singleSpecExchangeLimit;
    @ApiCloudField(value="AMA 商品 ID")
    private Integer itemNum;
}
