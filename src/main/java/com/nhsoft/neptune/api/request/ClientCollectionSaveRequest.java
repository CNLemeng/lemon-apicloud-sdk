package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsClientCollectionSaveDTOModel;

import com.nhsoft.neptune.api.domain.ClientCollectionVOModel;

import java.util.*;

/**
 * save_30请求类
 * 客户收款单新增
 */
public class ClientCollectionSaveRequest implements ApiCloudRequest<WhsClientCollectionSaveDTOModel, ClientCollectionVOModel> {

    private WhsClientCollectionSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.client.collection.save";
    }

    @Override
    public WhsClientCollectionSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsClientCollectionSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientCollectionVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientCollectionVOModel>>() {};
    }

}
