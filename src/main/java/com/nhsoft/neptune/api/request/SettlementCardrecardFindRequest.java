package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardSettlementDetailFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardConsumeVOModel;

import com.nhsoft.neptune.api.domain.CardConsumeVOModel;

import java.util.*;

/**
 * findCardRecardySettlementNo请求类
 * 会员卡结算单查询补扣明细
 */
public class SettlementCardrecardFindRequest implements ApiCloudRequest<CardSettlementDetailFindDTOModel, List<CardConsumeVOModel>> {

    private CardSettlementDetailFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.cardrecard.find";
    }

    @Override
    public CardSettlementDetailFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardSettlementDetailFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardConsumeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardConsumeVOModel>>>() {};
    }

}
