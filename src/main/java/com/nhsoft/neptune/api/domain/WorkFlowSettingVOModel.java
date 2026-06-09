package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WorkFlowSettingVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkFlowSettingVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="376")
    private Long id;
    @ApiCloudField(value="apply_number")
    private Integer applyNumber;
    @ApiCloudField(value="archived_flag", example="false")
    private Boolean archivedFlag;
    @ApiCloudField(value="created_at", example="2026-05-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="created_by", example="admin")
    private String createdBy;
    @ApiCloudField(value="description")
    private String description;
    @ApiCloudField(value="external_approval_flag", example="true")
    private Boolean externalApprovalFlag;
    @ApiCloudField(value="flow_define_id", example="9965800000401")
    private Long flowDefineId;
    @ApiCloudField(value="published_flag", example="true")
    private Boolean publishedFlag;
    @ApiCloudField(value="title", example="外部审批测试 0527001")
    private String title;
    @ApiCloudField(value="updated_at", example="2026-05-01 00:00:00")
    private String updatedAt;
    @ApiCloudField(value="updated_by", example="admin")
    private String updatedBy;
    @ApiCloudField(value="workflow_type_code", example="goods_apply")
    private String workflowTypeCode;
    @ApiCloudField(value="workflow_type_id", example="1")
    private Long workflowTypeId;
    @ApiCloudField(value="workflow_type_name", example="新品申请")
    private String workflowTypeName;
}
