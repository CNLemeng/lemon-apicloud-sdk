package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationApplyOrderBatchAuditDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationApplyOrderBatchAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_fids", example="[AA99658990000050]", required=true)
    private List<String> orderFids;
}
