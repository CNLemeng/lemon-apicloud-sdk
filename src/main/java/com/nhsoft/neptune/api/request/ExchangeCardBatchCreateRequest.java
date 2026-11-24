package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardBatchCreateDTOModel;

import com.nhsoft.neptune.api.domain.ExchangeCardBatchIdVOModel;

import java.util.*;

/**
 * createExchangeCard请求类
 * 次卡发卡
 */
public class ExchangeCardBatchCreateRequest implements ApiCloudRequest<ExchangeCardBatchCreateDTOModel, ExchangeCardBatchIdVOModel> {

    private ExchangeCardBatchCreateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.exchange.card.batch.create";
    }

    @Override
    public ExchangeCardBatchCreateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ExchangeCardBatchCreateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ExchangeCardBatchIdVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ExchangeCardBatchIdVOModel>>() {};
    }

}
