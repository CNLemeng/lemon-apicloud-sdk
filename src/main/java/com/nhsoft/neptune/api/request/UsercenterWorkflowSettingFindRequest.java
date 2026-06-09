package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WorkFlowSettingFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WorkFlowSettingVOModel;

import com.nhsoft.neptune.api.domain.WorkFlowSettingVOModel;

import java.util.*;

/**
 * findWorkFlowSetting请求类
 * 审批流程设置查询
 */
public class UsercenterWorkflowSettingFindRequest implements ApiCloudRequest<WorkFlowSettingFindDTOModel, List<WorkFlowSettingVOModel>> {

    private WorkFlowSettingFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.workflow.setting.find";
    }

    @Override
    public WorkFlowSettingFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WorkFlowSettingFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WorkFlowSettingVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WorkFlowSettingVOModel>>>() {};
    }

}
