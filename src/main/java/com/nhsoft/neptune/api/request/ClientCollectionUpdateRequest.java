package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsClientCollectionUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ClientCollectionVOModel;

import java.util.*;

/**
 * update_31请求类
 * 客户收款单修改
 */
public class ClientCollectionUpdateRequest implements ApiCloudRequest<WhsClientCollectionUpdateDTOModel, ClientCollectionVOModel> {

    private WhsClientCollectionUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.client.collection.update";
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
