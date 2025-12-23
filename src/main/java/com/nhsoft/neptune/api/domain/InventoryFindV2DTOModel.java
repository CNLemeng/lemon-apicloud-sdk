package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="商品编码列表", example="[1,2]")
    private List<Integer> itemNums;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="100", required=true)
    private Integer pageSize;
}
