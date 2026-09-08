package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventorySimpleVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventorySimpleVOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="商品编码", example="150050001")
    private Integer itemNum;
    @ApiCloudField(value="库存基本数量（小数点3位）", example="1.0")
    private BigDecimal inventoryAmount;
    @ApiCloudField(value="可用基本数量（小数点3位）", example="1.0")
    private BigDecimal inventoryValidAmount;
    @ApiCloudField(value="占用基本数量（小数点3位）", example="1.0")
    private BigDecimal inventoryLockAmount;
    @ApiCloudField(value="库存金额", example="1.0")
    private BigDecimal inventoryMoney;
    @ApiCloudField(value="库存辅助数量", example="1.0")
    private BigDecimal inventoryAssistAmount;
    @ApiCloudField(value="last_edit_time", example="2026-01-01 00:00:00")
    private String lastEditTime;
}
