package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardBatchBindDTOModel;

import java.util.*;

/**
 * bindExchangeCard请求类
 * 次卡批量绑定会员
 */
public class ExchangeCardBindRequest implements ApiCloudRequest<ExchangeCardBatchBindDTOModel, Object> {

    private ExchangeCardBatchBindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.exchange.card.bind";
    }

    @Override
    public ExchangeCardBatchBindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ExchangeCardBatchBindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
