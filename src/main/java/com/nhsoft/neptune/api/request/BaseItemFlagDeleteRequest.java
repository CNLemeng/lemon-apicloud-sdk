package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemFlagIdDTOModel;

import java.util.*;

/**
 * delete_4请求类
 * 商品查询模板删除
 */
public class BaseItemFlagDeleteRequest implements ApiCloudRequest<ItemFlagIdDTOModel, Object> {

    private ItemFlagIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.flag.delete";
    }

    @Override
    public ItemFlagIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemFlagIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
