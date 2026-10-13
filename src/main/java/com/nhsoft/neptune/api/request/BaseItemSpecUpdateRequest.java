package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BaseItemSpecUpdateDTOModel;

import java.util.*;

/**
 * updateItemSpec请求类
 * 商品规格修改
 */
public class BaseItemSpecUpdateRequest implements ApiCloudRequest<BaseItemSpecUpdateDTOModel, Object> {

    private BaseItemSpecUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.spec.update";
    }

    @Override
    public BaseItemSpecUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BaseItemSpecUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
