package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomizePackageIdDTOModel;

import com.nhsoft.neptune.api.domain.CustomizePackageVOModel;

import java.util.*;

/**
 * read_21请求类
 * 自选套餐查询
 */
public class RetailCustomizepackageReadRequest implements ApiCloudRequest<CustomizePackageIdDTOModel, CustomizePackageVOModel> {

    private CustomizePackageIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.customizepackage.read";
    }

    @Override
    public CustomizePackageIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomizePackageIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CustomizePackageVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CustomizePackageVOModel>>() {};
    }

}
