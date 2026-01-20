package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MakeUpOrderBranchReadDTOModel;

import com.nhsoft.neptune.api.domain.MakeUpOrderBranchResponseDTOModel;

import java.util.*;

/**
 * readBranchMakeUpOrder请求类
 * 门店扣补单读取
 */
public class MakeupBranchReadRequest implements ApiCloudRequest<MakeUpOrderBranchReadDTOModel, MakeUpOrderBranchResponseDTOModel> {

    private MakeUpOrderBranchReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.makeup.branch.read";
    }

    @Override
    public MakeUpOrderBranchReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MakeUpOrderBranchReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MakeUpOrderBranchResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MakeUpOrderBranchResponseDTOModel>>() {};
    }

}
