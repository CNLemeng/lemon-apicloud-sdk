package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="erp_store_id", example="99", required=true)
    private Integer erpStoreId;
    @ApiCloudField(value="order_id")
    private String orderId;
    @ApiCloudField(value="platform_order_id", example="MIX2026062300002")
    private String platformOrderId;
}
