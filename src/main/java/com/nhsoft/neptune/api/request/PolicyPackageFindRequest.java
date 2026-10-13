package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPackageFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PolicyPackageVOModel;

import com.nhsoft.neptune.api.domain.PolicyPackageVOModel;

import java.util.*;

/**
 * find_39请求类
 * 打包促销查询
 */
public class PolicyPackageFindRequest implements ApiCloudRequest<PolicyPackageFindDTOModel, List<PolicyPackageVOModel>> {

    private PolicyPackageFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.package.find";
    }

    @Override
    public PolicyPackageFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPackageFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PolicyPackageVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PolicyPackageVOModel>>>() {};
    }

}
