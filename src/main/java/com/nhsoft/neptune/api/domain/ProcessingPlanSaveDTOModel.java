package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingPlanSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingPlanSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="加工代号", example="20220822")
    private String processingPlanOrderCode;
    @ApiCloudField(value="操作人", example="业务员", required=true)
    private String processingPlanOrderOperator;
    @ApiCloudField(value="创建人", example="admin", required=true)
    private String processingPlanOrderCreator;
    @ApiCloudField(value="备注", example="1")
    private String processingPlanOrderMemo;
    @ApiCloudField(value="计划单截止时间", example="2022-08-22 16:12:06", required=true)
    private String processingPlanOrderDeadline;
    @ApiCloudField(value="生产计划单明细", required=true)
    private List<ProcessingPlanSaveDetailDTOModel> processingPlanOrderDetails;
}
