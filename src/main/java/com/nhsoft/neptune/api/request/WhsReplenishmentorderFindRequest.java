package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderVOModel;

import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderVOModel;

import java.util.*;

/**
 * find_15请求类
 * 批发补货单查询
 */
public class WhsReplenishmentorderFindRequest implements ApiCloudRequest<WhsReplenishmentOrderFindDTOModel, List<WhsReplenishmentOrderVOModel>> {

    private WhsReplenishmentOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.replenishmentorder.find";
    }

    @Override
    public WhsReplenishmentOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsReplenishmentOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WhsReplenishmentOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WhsReplenishmentOrderVOModel>>>() {};
    }

}
