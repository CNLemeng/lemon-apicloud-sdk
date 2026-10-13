package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPackageSaveDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPackageVOModel;

import java.util.*;

/**
 * saveAndAudit_12请求类
 * 打包促销新增并审核
 */
public class PolicyPackageSaveandauditRequest implements ApiCloudRequest<PolicyPackageSaveDTOModel, PolicyPackageVOModel> {

    private PolicyPackageSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.package.saveandaudit";
    }

    @Override
    public PolicyPackageSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPackageSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPackageVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPackageVOModel>>() {};
    }

}
