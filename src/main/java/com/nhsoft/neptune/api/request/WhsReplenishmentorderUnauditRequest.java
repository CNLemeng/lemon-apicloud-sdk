package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsReplenishmentOrderReadDTOModel;

import java.util.*;

/**
 * unAudit请求类
 * 批发补货单反审核
 */
public class WhsReplenishmentorderUnauditRequest implements ApiCloudRequest<WhsReplenishmentOrderReadDTOModel, Void> {

    private WhsReplenishmentOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.replenishmentorder.unaudit";
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
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
