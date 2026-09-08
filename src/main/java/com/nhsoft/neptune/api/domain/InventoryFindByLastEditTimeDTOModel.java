package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryFindByLastEditTimeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryFindByLastEditTimeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="storehouse_num", example="9967500001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="item_nums", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="last_edit_time", example="2026-07-01 00:00:00", required=true)
    private String lastEditTime;
}
