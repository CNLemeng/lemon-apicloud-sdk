package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardSettlementDetailFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardDepositVOModel;

import com.nhsoft.neptune.api.domain.CardDepositVOModel;

import java.util.*;

/**
 * findCardDepositBySettlementNo请求类
 * 会员卡结算单查询存款明细
 */
public class SettlementCarddepositFindRequest implements ApiCloudRequest<CardSettlementDetailFindDTOModel, List<CardDepositVOModel>> {

    private CardSettlementDetailFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.carddeposit.find";
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
    public TypeReference<ApiCloudResponse<List<CardDepositVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardDepositVOModel>>>() {};
    }

}
