package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomizePackageFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CustomizePackageVOModel;

import com.nhsoft.neptune.api.domain.CustomizePackageVOModel;

import java.util.*;

/**
 * find_19请求类
 * 自选套餐查询
 */
public class RetailCustomizepackageFindRequest implements ApiCloudRequest<CustomizePackageFindDTOModel, List<CustomizePackageVOModel>> {

    private CustomizePackageFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.customizepackage.find";
    }

    @Override
    public CustomizePackageFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomizePackageFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CustomizePackageVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CustomizePackageVOModel>>>() {};
    }

}
