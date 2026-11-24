package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardTypeIdDTOModel;

import java.util.*;

/**
 * delete_9请求类
 * 删除次卡类型
 */
public class ArgusExchangeCardTypeDeleteRequest implements ApiCloudRequest<ExchangeCardTypeIdDTOModel, Object> {

    private ExchangeCardTypeIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.exchange.card.type.delete";
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
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
