package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientLabelRelationBatchSaveDTOModel;

import java.util.*;

/**
 * saveClientLabelRelation请求类
 * 批发客户绑定标签
 */
public class WhsClientLabelRelationUpdateRequest implements ApiCloudRequest<ClientLabelRelationBatchSaveDTOModel, Void> {

    private ClientLabelRelationBatchSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.client.label.relation.update";
    }

    @Override
    public ClientLabelRelationBatchSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientLabelRelationBatchSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
