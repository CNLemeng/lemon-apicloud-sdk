package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosClientExtendBatchSaveDTOModel;

import java.util.*;

/**
 * updateClientExtend请求类
 * 客户拓展属性修改
 */
public class BasicClientExtendUpdateRequest implements ApiCloudRequest<PosClientExtendBatchSaveDTOModel, Void> {

    private PosClientExtendBatchSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.client.extend.update";
    }

    @Override
    public PosClientExtendBatchSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosClientExtendBatchSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
