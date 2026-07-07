package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BaseCenterSupplierParamVOModel;

import java.util.*;

/**
 * readSupplierParam请求类
 * 供应商参数读取
 */
public class BaseSupplierParamReadRequest implements ApiCloudRequest<Void, BaseCenterSupplierParamVOModel> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.supplier.param.read";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BaseCenterSupplierParamVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BaseCenterSupplierParamVOModel>>() {};
    }

}
