package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BaseCenterNewCreaseUpdateDTOModel;

import java.util.*;

/**
 * updateItemNewCrease请求类
 * 商品新品标记修改
 */
public class BaseItemNewcreaseUpdateRequest implements ApiCloudRequest<BaseCenterNewCreaseUpdateDTOModel, Object> {

    private BaseCenterNewCreaseUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.newcrease.update";
    }

    @Override
    public BaseCenterNewCreaseUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BaseCenterNewCreaseUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
