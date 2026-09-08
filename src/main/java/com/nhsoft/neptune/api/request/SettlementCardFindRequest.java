package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardSettlementFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardSettlementVOModel;

import com.nhsoft.neptune.api.domain.CardSettlementVOModel;

import java.util.*;

/**
 * cardSettlementFind_1请求类
 * 会员卡结算单查询
 */
public class SettlementCardFindRequest implements ApiCloudRequest<CardSettlementFindDTOModel, List<CardSettlementVOModel>> {

    private CardSettlementFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.card.find";
    }

    @Override
    public CardSettlementFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardSettlementFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardSettlementVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardSettlementVOModel>>>() {};
    }

}
