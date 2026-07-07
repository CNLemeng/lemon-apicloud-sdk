package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StockCarryDetailFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StockCarryDetailFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="结转任务编号", example="9965801000308", required=true)
    private Long stockCarryId;
    @ApiCloudField(value="仓库编号")
    private Integer storehouseNum;
}
