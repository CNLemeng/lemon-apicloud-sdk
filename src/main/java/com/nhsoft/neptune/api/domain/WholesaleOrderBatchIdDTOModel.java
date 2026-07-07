package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderBatchIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderBatchIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="wholesale_order_fids", example="[WO99658000004001]", required=true)
    private List<String> wholesaleOrderFids;
}
