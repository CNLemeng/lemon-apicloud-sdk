package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PromotionOrderPosItemPromotionFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PromotionOrderPosItemPromotionFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="date_from", example="2026-10-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-10-02", required=true)
    private String dateTo;
    @ApiCloudField(value="商品规格编码 specNum，非商品编码 itemNum；会同时匹配按品牌、类别、全场等范围配置的促销明细；不传时不按商品过滤", example="[9967500002495,9967500004909]")
    private List<Long> specNums;
}
