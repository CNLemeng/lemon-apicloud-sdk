package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemDetail模型
 * 线下商品兑换配置
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemDetailModel extends ApiCloudObject {

    @ApiCloudField(value="线下商品 ID", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品中心规格 ID")
    private Long specNum;
    @ApiCloudField(value="单商品兑换数量限制")
    private Integer singleItemExchangeLimit;
}
