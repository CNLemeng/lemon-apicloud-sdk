package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckPlanSaveDTOModel;

import com.nhsoft.neptune.api.domain.CheckPlanVOModel;

import java.util.*;

/**
 * find_13请求类
 * 盘点计划保存
 */
public class WmsCheckPlanSaveRequest implements ApiCloudRequest<CheckPlanSaveDTOModel, CheckPlanVOModel> {

    private CheckPlanSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.check.plan.save";
    }

    @Override
    public CheckPlanSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckPlanSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CheckPlanVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CheckPlanVOModel>>() {};
    }

}
