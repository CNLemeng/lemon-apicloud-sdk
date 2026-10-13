package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPackageUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPackageVOModel;

import java.util.*;

/**
 * update_26请求类
 * 打包促销修改
 */
public class PolicyPackageUpdateRequest implements ApiCloudRequest<PolicyPackageUpdateDTOModel, PolicyPackageVOModel> {

    private PolicyPackageUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.package.update";
    }

    @Override
    public PolicyPackageUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPackageUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPackageVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPackageVOModel>>() {};
    }

}
