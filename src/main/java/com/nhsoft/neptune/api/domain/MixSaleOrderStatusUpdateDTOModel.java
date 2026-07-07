package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixSaleOrderStatusUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixSaleOrderStatusUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="erp_store_id", example="99", required=true)
    private Integer erpStoreId;
    @ApiCloudField(value="platform_order_id", example="MIX2026062300002", required=true)
    private String platformOrderId;
    @ApiCloudField(value="status", example="SHIPPED", required=true)
    private String status;
    @ApiCloudField(value="status_time", example="2026-06-01 00:00:00", required=true)
    private String statusTime;
}
