package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomizePackageUpdateAppliedBranchDTOModel;

import java.util.*;

/**
 * updateAppliedBranch请求类
 * 自选套餐应用门店修改
 */
public class RetailCustomizepackageUpdateappliedbranchRequest implements ApiCloudRequest<CustomizePackageUpdateAppliedBranchDTOModel, Object> {

    private CustomizePackageUpdateAppliedBranchDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.customizepackage.updateappliedbranch";
    }

    @Override
    public CustomizePackageUpdateAppliedBranchDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomizePackageUpdateAppliedBranchDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
