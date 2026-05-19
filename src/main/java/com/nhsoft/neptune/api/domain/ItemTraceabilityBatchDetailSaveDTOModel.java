package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityBatchDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityBatchDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_traceability_id", required=true)
    private String itemTraceabilityId;
    @ApiCloudField(value="item_traceability_detail_list", required=true)
    private List<ItemTraceabilityDetailSaveDTOModel> itemTraceabilityDetailList;
}
