package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomizePackageSaveDTOModel;

import com.nhsoft.neptune.api.domain.CustomizePackageVOModel;

import java.util.*;

/**
 * save_12请求类
 * 自选套餐保存
 */
public class RetailCustomizepackageSaveRequest implements ApiCloudRequest<CustomizePackageSaveDTOModel, CustomizePackageVOModel> {

    private CustomizePackageSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.customizepackage.save";
    }

    @Override
    public CustomizePackageSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomizePackageSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CustomizePackageVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CustomizePackageVOModel>>() {};
    }

}
