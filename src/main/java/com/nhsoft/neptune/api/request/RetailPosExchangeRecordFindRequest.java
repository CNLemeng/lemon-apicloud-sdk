package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosExchangeRecordFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosExchangeRecordVOModel;

import com.nhsoft.neptune.api.domain.PosExchangeRecordVOModel;

import java.util.*;

/**
 * find_25请求类
 * 兑奖记录查询
 */
public class RetailPosExchangeRecordFindRequest implements ApiCloudRequest<PosExchangeRecordFindDTOModel, List<PosExchangeRecordVOModel>> {

    private PosExchangeRecordFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.pos.exchange.record.find";
    }

    @Override
    public PosExchangeRecordFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosExchangeRecordFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosExchangeRecordVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosExchangeRecordVOModel>>>() {};
    }

}
