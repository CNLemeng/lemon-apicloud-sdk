package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPackageUpdateAppliedBranchDTOModel;

import java.util.*;

/**
 * updateAppliedBranch请求类
 * 打包促销应用门店修改
 */
public class PolicyPackageApplyBranchUpdateRequest implements ApiCloudRequest<PolicyPackageUpdateAppliedBranchDTOModel, Void> {

    private PolicyPackageUpdateAppliedBranchDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.package.apply.branch.update";
    }

    @Override
    public PolicyPackageUpdateAppliedBranchDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPackageUpdateAppliedBranchDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
