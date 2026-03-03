package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveOrderBatchIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveOrderBatchIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="外部单号列表", example="[99675000001]", required=true)
    private List<String> outBillNos;
}
