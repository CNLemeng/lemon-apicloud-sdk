package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomizePackageOperateDTOModel;

import com.nhsoft.neptune.api.domain.CustomizePackageVOModel;

import java.util.*;

/**
 * audit_4请求类
 * 自选套餐审核
 */
public class RetailCustomizepackageAuditRequest implements ApiCloudRequest<CustomizePackageOperateDTOModel, CustomizePackageVOModel> {

    private CustomizePackageOperateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.customizepackage.audit";
    }

    @Override
    public CustomizePackageOperateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomizePackageOperateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CustomizePackageVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CustomizePackageVOModel>>() {};
    }

}
