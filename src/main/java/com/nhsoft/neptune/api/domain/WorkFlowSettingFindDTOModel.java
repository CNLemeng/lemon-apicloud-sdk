package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WorkFlowSettingFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WorkFlowSettingFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="archived_flag", example="true")
    private Boolean archivedFlag;
    @ApiCloudField(value="published_flag", example="true")
    private Boolean publishedFlag;
    @ApiCloudField(value="key", example="关键字")
    private String key;
    @ApiCloudField(value="external_approval_flag", example="true")
    private Boolean externalApprovalFlag;
    @ApiCloudField(value="id_list")
    private List<Long> idList;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="workflow_type_id_list")
    private List<Long> workflowTypeIdList;
}
