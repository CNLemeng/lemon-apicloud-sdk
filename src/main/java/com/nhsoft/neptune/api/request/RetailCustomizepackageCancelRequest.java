package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomizePackageOperateDTOModel;

import com.nhsoft.neptune.api.domain.CustomizePackageVOModel;

import java.util.*;

/**
 * cancel_2请求类
 * 自选套餐作废
 */
public class RetailCustomizepackageCancelRequest implements ApiCloudRequest<CustomizePackageOperateDTOModel, CustomizePackageVOModel> {

    private CustomizePackageOperateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.customizepackage.cancel";
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
