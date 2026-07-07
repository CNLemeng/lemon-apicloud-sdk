package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsFailedOrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsFailedOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="date_from", example="2026-01-01 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-01-01 00:00:00")
    private String dateTo;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="100", required=true)
    private Integer pageSize;
    @ApiCloudField(value="platform_order_id", example="MIX2026062300002")
    private String platformOrderId;
    @ApiCloudField(value="platform_refund_id", example="MIX2026062300002")
    private String platformRefundId;
    @ApiCloudField(value="reason", example="1")
    private String reason;
    @ApiCloudField(value="status", example="1")
    private Integer status;
}
