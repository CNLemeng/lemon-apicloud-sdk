package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberLevelPriceAdjustmentDetailSaveDTO模型
 * 调整明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberLevelPriceAdjustmentDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品规格编号", example="9965800001681", required=true)
    private Long specNum;
    @ApiCloudField(value="V0会员等级价格", example="6.0")
    private BigDecimal v0MemberLevelPrice;
    @ApiCloudField(value="V1会员等级价格", example="5.5")
    private BigDecimal v1MemberLevelPrice;
    @ApiCloudField(value="V2会员等级价格", example="5.0")
    private BigDecimal v2MemberLevelPrice;
    @ApiCloudField(value="V3会员等级价格", example="4.5")
    private BigDecimal v3MemberLevelPrice;
    @ApiCloudField(value="V4会员等级价格", example="4.0")
    private BigDecimal v4MemberLevelPrice;
    @ApiCloudField(value="V5会员等级价格", example="3.5")
    private BigDecimal v5MemberLevelPrice;
    @ApiCloudField(value="V6会员等级价格", example="3.0")
    private BigDecimal v6MemberLevelPrice;
    @ApiCloudField(value="V7会员等级价格", example="2.5")
    private BigDecimal v7MemberLevelPrice;
    @ApiCloudField(value="V8会员等级价格", example="2.0")
    private BigDecimal v8MemberLevelPrice;
    @ApiCloudField(value="V9会员等级价格", example="1.5")
    private BigDecimal v9MemberLevelPrice;
    @ApiCloudField(value="V10会员等级价格", example="1.0")
    private BigDecimal v10MemberLevelPrice;
}
