package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderFullyVOModel;

import java.util.*;

/**
 * audit_1请求类
 * 批发补货单审核
 */
public class WhsReplenishmentorderAuditRequest implements ApiCloudRequest<WhsReplenishmentOrderUpdateDTOModel, WhsReplenishmentOrderFullyVOModel> {

    private WhsReplenishmentOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.replenishmentorder.audit";
    }

    @Override
    public WhsReplenishmentOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsReplenishmentOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsReplenishmentOrderFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsReplenishmentOrderFullyVOModel>>() {};
    }

}
