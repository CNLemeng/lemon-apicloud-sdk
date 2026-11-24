package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardTypeUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ExchangeCardTypeDetailVOModel;

import java.util.*;

/**
 * update_16请求类
 * 编辑次卡类型
 */
public class ArgusExchangeCardTypeUpdateRequest implements ApiCloudRequest<ExchangeCardTypeUpdateDTOModel, ExchangeCardTypeDetailVOModel> {

    private ExchangeCardTypeUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.exchange.card.type.update";
    }

    @Override
    public ExchangeCardTypeUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ExchangeCardTypeUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ExchangeCardTypeDetailVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ExchangeCardTypeDetailVOModel>>() {};
    }

}
