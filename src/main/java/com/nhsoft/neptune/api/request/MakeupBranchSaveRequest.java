package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MakeUpOrderBranchSaveDTOModel;

import com.nhsoft.neptune.api.domain.MakeUpOrderBranchResponseDTOModel;

import java.util.*;

/**
 * save_26请求类
 * 门店扣补单新增
 */
public class MakeupBranchSaveRequest implements ApiCloudRequest<MakeUpOrderBranchSaveDTOModel, MakeUpOrderBranchResponseDTOModel> {

    private MakeUpOrderBranchSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.makeup.branch.save";
    }

    @Override
    public MakeUpOrderBranchSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MakeUpOrderBranchSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MakeUpOrderBranchResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MakeUpOrderBranchResponseDTOModel>>() {};
    }

}
