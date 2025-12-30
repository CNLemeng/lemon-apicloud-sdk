package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingPlanReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingPlanReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="计划单编号", example="JP4344991001539", required=true)
    private String processingPlanOrderFid;
}
