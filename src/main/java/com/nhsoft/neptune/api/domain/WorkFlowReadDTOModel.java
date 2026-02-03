package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WorkFlowReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkFlowReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="审批记录编号", example="SP99658202601270000025", required=true)
    private String instanceId;
}
