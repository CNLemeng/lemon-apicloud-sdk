package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomizePackageOperateDTOModel;

import java.util.*;

/**
 * delete_5请求类
 * 自选套餐删除
 */
public class RetailCustomizepackageDeleteRequest implements ApiCloudRequest<CustomizePackageOperateDTOModel, Object> {

    private CustomizePackageOperateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.customizepackage.delete";
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
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
