package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderFullyVOModel;

import java.util.*;

/**
 * read_19请求类
 * 批发补货单读取
 */
public class WhsReplenishmentorderReadRequest implements ApiCloudRequest<WhsReplenishmentOrderReadDTOModel, WhsReplenishmentOrderFullyVOModel> {

    private WhsReplenishmentOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.replenishmentorder.read";
    }

    @Override
    public WhsReplenishmentOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsReplenishmentOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsReplenishmentOrderFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsReplenishmentOrderFullyVOModel>>() {};
    }

}
