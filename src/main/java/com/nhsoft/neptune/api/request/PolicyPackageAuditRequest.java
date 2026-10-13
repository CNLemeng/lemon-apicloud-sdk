package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPackageIdOperateDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPackageVOModel;

import java.util.*;

/**
 * audit_13请求类
 * 打包促销审核
 */
public class PolicyPackageAuditRequest implements ApiCloudRequest<PolicyPackageIdOperateDTOModel, PolicyPackageVOModel> {

    private PolicyPackageIdOperateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.package.audit";
    }

    @Override
    public PolicyPackageIdOperateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPackageIdOperateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPackageVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPackageVOModel>>() {};
    }

}
