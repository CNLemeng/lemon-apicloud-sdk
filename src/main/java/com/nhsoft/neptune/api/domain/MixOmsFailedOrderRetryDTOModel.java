package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsFailedOrderRetryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsFailedOrderRetryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_id", required=true)
    private String orderId;
    @ApiCloudField(value="re_push_order_time", example="true")
    private Boolean rePushOrderTime;
    @ApiCloudField(value="refund_id")
    private Integer refundId;
}
