package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ChainDeliveryParamVOModel;

import java.util.*;

/**
 * readChainParam请求类
 * 读取连锁系统参数
 */
public class ChainDeliveryParamReadRequest implements ApiCloudRequest<Void, ChainDeliveryParamVOModel> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.delivery.param.read";
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
    public TypeReference<ApiCloudResponse<ChainDeliveryParamVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ChainDeliveryParamVOModel>>() {};
    }

}
