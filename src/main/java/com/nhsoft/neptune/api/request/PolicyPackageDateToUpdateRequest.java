package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPackageUpdatePromotionDateToDTOModel;

import java.util.*;

/**
 * updatePromotionDateTo请求类
 * 打包促销修改结束时间
 */
public class PolicyPackageDateToUpdateRequest implements ApiCloudRequest<PolicyPackageUpdatePromotionDateToDTOModel, Void> {

    private PolicyPackageUpdatePromotionDateToDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.package.date.to.update";
    }

    @Override
    public PolicyPackageUpdatePromotionDateToDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPackageUpdatePromotionDateToDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
