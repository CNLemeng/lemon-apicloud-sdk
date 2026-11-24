package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardOperateFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardOperateVOModel;

import com.nhsoft.neptune.api.domain.CardOperateVOModel;

import java.util.*;

/**
 * findOperateRecords请求类
 * 储值卡操作记录查询
 */
public class CardOperateFindRequest implements ApiCloudRequest<CardOperateFindDTOModel, List<CardOperateVOModel>> {

    private CardOperateFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.operate.find";
    }

    @Override
    public CardOperateFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardOperateFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardOperateVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardOperateVOModel>>>() {};
    }

}
