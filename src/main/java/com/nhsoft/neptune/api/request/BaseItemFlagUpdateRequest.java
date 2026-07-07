package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemFlagUpdateDTOModel;

import java.util.*;

/**
 * update_13请求类
 * 商品查询模板修改
 */
public class BaseItemFlagUpdateRequest implements ApiCloudRequest<ItemFlagUpdateDTOModel, Object> {

    private ItemFlagUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.flag.update";
    }

    @Override
    public ItemFlagUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemFlagUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
