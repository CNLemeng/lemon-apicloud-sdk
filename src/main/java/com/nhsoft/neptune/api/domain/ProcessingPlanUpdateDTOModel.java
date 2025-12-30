package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingPlanUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingPlanUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="计划单编号", example="JP4344991001539", required=true)
    private String processingPlanOrderFid;
    @ApiCloudField(value="加工代号", example="20220822")
    private String processingPlanOrderCode;
    @ApiCloudField(value="操作人", example="业务员")
    private String processingPlanOrderOperator;
    @ApiCloudField(value="备注", example="1")
    private String processingPlanOrderMemo;
    @ApiCloudField(value="计划单截止时间", example="2022-08-22 16:12:06")
    private String processingPlanOrderDeadline;
    @ApiCloudField(value="生产计划单明细", required=true)
    private List<ProcessingPlanSaveDetailDTOModel> processingPlanOrderDetails;
    @ApiCloudField(value="单据修改人", example="admin", required=true)
    private String processingPlanOrderLastEditor;
}
