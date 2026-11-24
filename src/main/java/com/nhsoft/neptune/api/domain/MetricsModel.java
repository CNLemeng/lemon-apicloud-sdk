package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * Metrics模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MetricsModel extends ApiCloudObject {

    @ApiCloudField(value="basic_qty")
    private BigDecimal basicQty;
    @ApiCloudField(value="transfer_qty")
    private BigDecimal transferQty;
    @ApiCloudField(value="transfer_money")
    private BigDecimal transferMoney;
    @ApiCloudField(value="transfer_profit")
    private BigDecimal transferProfit;
    @ApiCloudField(value="delivered_branch_count")
    private BigDecimal deliveredBranchCount;
    @ApiCloudField(value="undelivered_branch_count")
    private BigDecimal undeliveredBranchCount;
}
