package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemFlagIdDTOModel;

import com.nhsoft.neptune.api.domain.ItemFlagFullyVOModel;

import java.util.*;

/**
 * read_26请求类
 * 商品查询模板读取
 */
public class BaseItemFlagReadRequest implements ApiCloudRequest<ItemFlagIdDTOModel, ItemFlagFullyVOModel> {

    private ItemFlagIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.flag.read";
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
    public TypeReference<ApiCloudResponse<ItemFlagFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ItemFlagFullyVOModel>>() {};
    }

}
