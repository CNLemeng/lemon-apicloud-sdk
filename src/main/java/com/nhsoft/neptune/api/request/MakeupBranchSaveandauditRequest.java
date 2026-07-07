package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MakeUpOrderBranchSaveDTOModel;

import com.nhsoft.neptune.api.domain.MakeUpOrderBranchResponseDTOModel;

import java.util.*;

/**
 * saveAndAudit_12请求类
 * 门店扣补单新增并审核
 */
public class MakeupBranchSaveandauditRequest implements ApiCloudRequest<MakeUpOrderBranchSaveDTOModel, MakeUpOrderBranchResponseDTOModel> {

    private MakeUpOrderBranchSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.makeup.branch.saveandaudit";
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
