package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsReplenishmentOrderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsReplenishmentOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="批发货补单编号", example="RSO0010990000000006")
    private String replenishmentOrderId;
    @ApiCloudField(value="补货合计金额", example="100.0")
    private BigDecimal replenishmentMoney;
    @ApiCloudField(value="结算状态(UNSETTLED:未结算)", example="UNSETTLED")
    private String settleStatus;
    @ApiCloudField(value="状态码（1：制单，3：制单|审核）", example="1")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String stateName;
    @ApiCloudField(value="制单时间", example="2023-01-01 00:00:00")
    private String createTime;
    @ApiCloudField(value="审核时间", example="2023-01-01 00:00:00")
    private String auditTime;
    @ApiCloudField(value="制单人", example="admin")
    private String createUser;
    @ApiCloudField(value="审核人", example="admin")
    private String auditUser;
    @ApiCloudField(value="批发销售单号", example="WO1099990000239")
    private String wholesaleOrderFid;
}
