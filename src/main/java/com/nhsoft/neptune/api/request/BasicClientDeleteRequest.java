package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosClientDeleteDTOModel;

import java.util.*;

/**
 * deleteClient请求类
 * 客户删除
 */
public class BasicClientDeleteRequest implements ApiCloudRequest<PosClientDeleteDTOModel, Void> {

    private PosClientDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.client.delete";
    }

    @Override
    public PosClientDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosClientDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
