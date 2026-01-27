package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryUpdateAssistAmountDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryUpdateAssistAmountDTOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编码", example="996750001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="商品系统编码", example="1648", required=true)
    private Integer itemNum;
    @ApiCloudField(value="库存明细批次号", example="20260121")
    private String inventoryLnDetailLotNumber;
    @ApiCloudField(value="调整数量", example="10", required=true)
    private BigDecimal adjustAmount;
}
