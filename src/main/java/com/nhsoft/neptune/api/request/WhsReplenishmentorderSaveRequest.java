package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderFullyVOModel;

import java.util.*;

/**
 * save_4请求类
 * 批发补货单新增
 */
public class WhsReplenishmentorderSaveRequest implements ApiCloudRequest<WhsReplenishmentOrderSaveDTOModel, WhsReplenishmentOrderFullyVOModel> {

    private WhsReplenishmentOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.replenishmentorder.save";
    }

    @Override
    public WhsReplenishmentOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsReplenishmentOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsReplenishmentOrderFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsReplenishmentOrderFullyVOModel>>() {};
    }

}
