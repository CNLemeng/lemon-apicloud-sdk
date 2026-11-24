package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomizePackageUpdateDateToDTOModel;

import java.util.*;

/**
 * updateDateTo请求类
 * 自选套餐结束日期修改
 */
public class RetailCustomizepackageUpdatedatetoRequest implements ApiCloudRequest<CustomizePackageUpdateDateToDTOModel, Object> {

    private CustomizePackageUpdateDateToDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.customizepackage.updatedateto";
    }

    @Override
    public CustomizePackageUpdateDateToDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomizePackageUpdateDateToDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
