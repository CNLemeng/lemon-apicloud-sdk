package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WorkFlowOrderInstanceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkFlowOrderInstanceVOModel extends ApiCloudObject {

    @ApiCloudField(value="instance_id", example="SP99658202601270000006")
    private String instanceId;
}
