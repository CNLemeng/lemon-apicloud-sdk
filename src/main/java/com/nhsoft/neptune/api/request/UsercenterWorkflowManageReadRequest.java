package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WorkFlowReadDTOModel;

import com.nhsoft.neptune.api.domain.WorkFlowVOModel;

import java.util.*;

/**
 * read_21请求类
 * 审批流记录读取
 */
public class UsercenterWorkflowManageReadRequest implements ApiCloudRequest<WorkFlowReadDTOModel, WorkFlowVOModel> {

    private WorkFlowReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.workflow.manage.read";
    }

    @Override
    public WorkFlowReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WorkFlowReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WorkFlowVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WorkFlowVOModel>>() {};
    }

}
