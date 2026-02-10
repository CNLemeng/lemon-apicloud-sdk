package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StockCarryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StockCarryVOModel extends ApiCloudObject {

    @ApiCloudField(value="结转任务编号", example="9965801000308")
    private Long stockCarryId;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="结转日期", example="2025-01-01 00:00:00")
    private String stockCarryDate;
    @ApiCloudField(value="制单人", example="admin")
    private String stockCarryCreator;
    @ApiCloudField(value="制单时间", example="2025-01-01 00:00:00")
    private String stockCarryCreateTime;
    @ApiCloudField(value="状态(2:已结转;1、4:未结转;3:结转中)", example="2")
    private Integer stockCarryStatus;
    @ApiCloudField(value="上次结转时间", example="2025-01-01 00:00:00")
    private String stockCarryLastCarryDate;
    @ApiCloudField(value="结转成本单价规则,取WebSystemBook的stockCarryCostType")
    private Integer stockCarryCostType;
    @ApiCloudField(value="结转时间", example="2025-01-01 00:00:00")
    private String stockCarryTime;
    @ApiCloudField(value="结转错误日志", example="结转周期不能超过62天")
    private String stockCarryErrorLog;
    @ApiCloudField(value="当前库存重新计算快照")
    private Boolean stockCarryLastInventory;
    @ApiCloudField(value="当前库存重新计算快照时间")
    private String stockCarryLastInventoryTime;
    @ApiCloudField(value="预结转")
    private Boolean stockCarryPreStock;
}
