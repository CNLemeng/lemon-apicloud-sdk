package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPackageIdDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPackageVOModel;

import java.util.*;

/**
 * read_36请求类
 * 打包促销读取
 */
public class PolicyPackageReadRequest implements ApiCloudRequest<PolicyPackageIdDTOModel, PolicyPackageVOModel> {

    private PolicyPackageIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.package.read";
    }

    @Override
    public PolicyPackageIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPackageIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPackageVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPackageVOModel>>() {};
    }

}
