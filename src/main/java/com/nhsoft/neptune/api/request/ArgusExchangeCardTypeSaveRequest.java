package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardTypeCreateDTOModel;

import com.nhsoft.neptune.api.domain.ExchangeCardTypeDetailVOModel;

import java.util.*;

/**
 * create请求类
 * 创建次卡类型
 */
public class ArgusExchangeCardTypeSaveRequest implements ApiCloudRequest<ExchangeCardTypeCreateDTOModel, ExchangeCardTypeDetailVOModel> {

    private ExchangeCardTypeCreateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.exchange.card.type.save";
    }

    @Override
    public ExchangeCardTypeCreateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ExchangeCardTypeCreateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ExchangeCardTypeDetailVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ExchangeCardTypeDetailVOModel>>() {};
    }

}
