package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_traceability_ids")
    private List<String> itemTraceabilityIds;
}
