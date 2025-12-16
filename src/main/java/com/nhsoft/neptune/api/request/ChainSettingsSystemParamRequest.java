package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WebSystemBookVOModel;

import java.util.*;

/**
 * readSystemParam请求类
 * 系统参数读取
 */
public class ChainSettingsSystemParamRequest implements ApiCloudRequest<Void, WebSystemBookVOModel> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.settings.system.param";
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
    public TypeReference<ApiCloudResponse<WebSystemBookVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WebSystemBookVOModel>>() {};
    }

}
