package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BaseCenterItemEliminateDTOModel;

import java.util.*;

/**
 * updateEliminate请求类
 * 商品淘汰
 */
public class BaseItemEliminateUpdateRequest implements ApiCloudRequest<BaseCenterItemEliminateDTOModel, Object> {

    private BaseCenterItemEliminateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.eliminate.update";
    }

    @Override
    public BaseCenterItemEliminateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BaseCenterItemEliminateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
