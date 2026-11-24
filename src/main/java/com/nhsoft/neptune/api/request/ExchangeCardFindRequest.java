package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ExchangeCardVOModel;

import com.nhsoft.neptune.api.domain.ExchangeCardVOModel;

import java.util.*;

/**
 * findExchangeCard请求类
 * 次卡查询
 */
public class ExchangeCardFindRequest implements ApiCloudRequest<ExchangeCardFindDTOModel, List<ExchangeCardVOModel>> {

    private ExchangeCardFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.exchange.card.find";
    }

    @Override
    public ExchangeCardFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ExchangeCardFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ExchangeCardVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ExchangeCardVOModel>>>() {};
    }

}
