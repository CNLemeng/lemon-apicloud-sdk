package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardInvalidDTOModel;

import java.util.*;

/**
 * invalidExchangeCard请求类
 * 批量作废次卡
 */
public class ExchangeCardInvalidRequest implements ApiCloudRequest<ExchangeCardInvalidDTOModel, Object> {

    private ExchangeCardInvalidDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.exchange.card.invalid";
    }

    @Override
    public ExchangeCardInvalidDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ExchangeCardInvalidDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
