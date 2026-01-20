package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryProductDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryProductDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="storehouse_num")
    private Integer storehouseNum;
    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="inventory_product_num")
    private String inventoryProductNum;
    @ApiCloudField(value="item_product_date")
    private String itemProductDate;
    @ApiCloudField(value="inventory_amount")
    private BigDecimal inventoryAmount;
    @ApiCloudField(value="branch_num")
    private Integer branchNum;
    @ApiCloudField(value="last_edit_time", example="2023-04-01 00:00:00")
    private String lastEditTime;
}
