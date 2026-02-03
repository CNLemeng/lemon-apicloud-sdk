package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WorkFlowApprovalDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WorkFlowApprovalResultVOModel;

import com.nhsoft.neptune.api.domain.WorkFlowApprovalResultVOModel;

import java.util.*;

/**
 * approve请求类
 * 审批流审批
 */
public class UsercenterWorkflowManageApproveRequest implements ApiCloudRequest<WorkFlowApprovalDTOModel, List<WorkFlowApprovalResultVOModel>> {

    private WorkFlowApprovalDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.workflow.manage.approve";
    }

    @Override
    public WorkFlowApprovalDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WorkFlowApprovalDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WorkFlowApprovalResultVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WorkFlowApprovalResultVOModel>>>() {};
    }

}
