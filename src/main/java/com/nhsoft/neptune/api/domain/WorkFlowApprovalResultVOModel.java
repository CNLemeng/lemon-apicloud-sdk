package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WorkFlowApprovalResultVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkFlowApprovalResultVOModel extends ApiCloudObject {

    @ApiCloudField(value="id")
    private String id;
    @ApiCloudField(value="流程定义id")
    private Long definitionId;
    @ApiCloudField(value="关联单据号", example="99658A0991000918")
    private String businessId;
    @ApiCloudField(value="处理")
    private String message;
}
