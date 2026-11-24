package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardTypeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ExchangeCardTypeDetailVOModel;

import com.nhsoft.neptune.api.domain.ExchangeCardTypeDetailVOModel;

import java.util.*;

/**
 * find_34请求类
 * 查询次卡类型列表
 */
public class ArgusExchangeCardTypeFindRequest implements ApiCloudRequest<ExchangeCardTypeFindDTOModel, List<ExchangeCardTypeDetailVOModel>> {

    private ExchangeCardTypeFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.exchange.card.type.find";
    }

    @Override
    public ExchangeCardTypeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ExchangeCardTypeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ExchangeCardTypeDetailVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ExchangeCardTypeDetailVOModel>>>() {};
    }

}
