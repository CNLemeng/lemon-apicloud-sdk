package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsClientCollectionUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ClientCollectionVOModel;

import java.util.*;

/**
 * audit_15请求类
 * 客户收款单审核
 */
public class ClientCollectionAuditRequest implements ApiCloudRequest<WhsClientCollectionUpdateDTOModel, ClientCollectionVOModel> {

    private WhsClientCollectionUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.client.collection.audit";
    }

    @Override
    public WhsClientCollectionUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsClientCollectionUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientCollectionVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientCollectionVOModel>>() {};
    }

}
