package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WorkFlowRevokeDTOModel;

import java.util.*;

/**
 * revoke请求类
 * 审批流撤销
 */
public class UsercenterWorkflowManageRevokeRequest implements ApiCloudRequest<WorkFlowRevokeDTOModel, Void> {

    private WorkFlowRevokeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.workflow.manage.revoke";
    }

    @Override
    public WorkFlowRevokeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WorkFlowRevokeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
