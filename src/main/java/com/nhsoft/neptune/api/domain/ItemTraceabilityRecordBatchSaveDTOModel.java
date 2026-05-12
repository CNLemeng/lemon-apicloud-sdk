package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityRecordBatchSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityRecordBatchSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_traceability_details", required=true)
    private List<ItemTraceabilitySaveDTOModel> itemTraceabilityDetails;
    @ApiCloudField(value="operator", required=true)
    private String operator;
}
