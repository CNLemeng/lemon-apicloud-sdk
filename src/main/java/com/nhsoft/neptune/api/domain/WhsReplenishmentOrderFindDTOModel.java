package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsReplenishmentOrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsReplenishmentOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型(制单时间|审核时间)", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2023-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2023-01-02 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="状态码（1：制单，3：制单|审核）", example="1")
    private Integer stateCode;
    @ApiCloudField(value="结算状态(UNSETTLED:未结算|PARTIAL:部分结算|SETTLED:已结算)", example="UNSETTLED")
    private String settleStatus;
    @ApiCloudField(value="客户编号", example="001099990000001")
    private String clientFid;
    @ApiCloudField(value="查询页码(从1开始)", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大200)", example="200", required=true)
    private Integer pageSize;
}
