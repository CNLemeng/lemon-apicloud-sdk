package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MakeUpOrderBranchUpdateDTOModel;

import com.nhsoft.neptune.api.domain.MakeUpOrderBranchResponseDTOModel;

import java.util.*;

/**
 * update_26请求类
 * 门店扣补单修改
 */
public class MakeupBranchUpdateRequest implements ApiCloudRequest<MakeUpOrderBranchUpdateDTOModel, MakeUpOrderBranchResponseDTOModel> {

    private MakeUpOrderBranchUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.makeup.branch.update";
    }

    @Override
    public MakeUpOrderBranchUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MakeUpOrderBranchUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MakeUpOrderBranchResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MakeUpOrderBranchResponseDTOModel>>() {};
    }

}
