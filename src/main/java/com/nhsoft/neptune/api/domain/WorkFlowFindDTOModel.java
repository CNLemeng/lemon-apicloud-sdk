package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WorkFlowFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkFlowFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="日期类型(APPLY_DATE:发起日期|APPROVE_DATE:审批日期)", example="APPLY_DATE", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2026-01-28 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2026-01-29 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="审批状态(1:审批中|6:撤销|8:通过|9:驳回)", example="[1,6]")
    private List<String> flowStatusList;
    @ApiCloudField(value="单据类型(goods_apply:新品申请|adjustment_order:库存调整|price_adjustment:商品调价单)", example="[goods_apply]")
    private List<String> businessWorkFlowTypeList;
    @ApiCloudField(value="审批流程id")
    private List<Long> relationItemIdList;
    @ApiCloudField(value="申请人id(company_user_id)", example="[441637]")
    private List<Long> applicantIdList;
    @ApiCloudField(value="审批人id(company_user_id)", example="[441637]")
    private List<Long> currentApproverIdList;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大为200）", example="10", required=true)
    private Integer pageSize;
}
