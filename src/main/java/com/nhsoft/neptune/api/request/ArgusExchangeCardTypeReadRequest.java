package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardTypeIdDTOModel;

import com.nhsoft.neptune.api.domain.ExchangeCardTypeDetailVOModel;

import java.util.*;

/**
 * read_27请求类
 * 查看次卡类型详情
 */
public class ArgusExchangeCardTypeReadRequest implements ApiCloudRequest<ExchangeCardTypeIdDTOModel, ExchangeCardTypeDetailVOModel> {

    private ExchangeCardTypeIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.exchange.card.type.read";
    }

    @Override
    public ExchangeCardTypeIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ExchangeCardTypeIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ExchangeCardTypeDetailVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ExchangeCardTypeDetailVOModel>>() {};
    }

}
