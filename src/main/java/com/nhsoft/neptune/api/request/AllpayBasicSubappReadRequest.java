package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SubPayAppReadDTOModel;

import com.nhsoft.neptune.api.domain.SubPayAppDTOModel;

import java.util.*;

/**
 * readByAppid请求类
 * 子商户读取
 */
public class AllpayBasicSubappReadRequest implements ApiCloudRequest<SubPayAppReadDTOModel, SubPayAppDTOModel> {

    private SubPayAppReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.allpay.basic.subapp.read";
    }

    @Override
    public SubPayAppReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SubPayAppReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SubPayAppDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SubPayAppDTOModel>>() {};
    }

}
