package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WorkFlowFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WorkFlowVOModel;

import com.nhsoft.neptune.api.domain.WorkFlowVOModel;

import java.util.*;

/**
 * find_18请求类
 * 审批流记录查询
 */
public class UsercenterWorkflowManageFindRequest implements ApiCloudRequest<WorkFlowFindDTOModel, List<WorkFlowVOModel>> {

    private WorkFlowFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.workflow.manage.find";
    }

    @Override
    public WorkFlowFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WorkFlowFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WorkFlowVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WorkFlowVOModel>>>() {};
    }

}
