package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MercuryRefundOrderStateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MercuryRefundOrderStateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="refund_id", example="RW2026091400001", required=true)
    private String refundId;
    @ApiCloudField(value="wdt_refund_state", required=true)
    private String wdtRefundState;
}
