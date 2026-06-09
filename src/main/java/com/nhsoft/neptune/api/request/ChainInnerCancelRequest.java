package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerReadV2DTOModel;

import java.util.*;

/**
 * inspect请求类
 * 内部申请单作废
 */
public class ChainInnerCancelRequest implements ApiCloudRequest<InnerReadV2DTOModel, Void> {

    private InnerReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.cancel";
    }

    @Override
    public InnerReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
