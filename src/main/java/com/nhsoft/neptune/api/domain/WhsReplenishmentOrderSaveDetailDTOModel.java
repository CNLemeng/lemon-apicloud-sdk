package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsReplenishmentOrderSaveDetailDTO模型
 * 明细列表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsReplenishmentOrderSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="补货价格", example="1.5", required=true)
    private BigDecimal replenishmentPrice;
    @ApiCloudField(value="补货数量", example="1", required=true)
    private BigDecimal replenishmentQty;
    @ApiCloudField(value="备注", example="测试")
    private String memo;
    @ApiCloudField(value="商品规格单位", example="公斤")
    private String itemSpecUnit;
    @ApiCloudField(value="批次号", example="2023-01-01")
    private String lotNumber;
}
