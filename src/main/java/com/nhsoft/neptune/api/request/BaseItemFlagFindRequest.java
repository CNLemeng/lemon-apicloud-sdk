package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemFlagFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ItemFlagVOModel;

import com.nhsoft.neptune.api.domain.ItemFlagVOModel;

import java.util.*;

/**
 * find_20请求类
 * 商品查询模板查询
 */
public class BaseItemFlagFindRequest implements ApiCloudRequest<ItemFlagFindDTOModel, List<ItemFlagVOModel>> {

    private ItemFlagFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.flag.find";
    }

    @Override
    public ItemFlagFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemFlagFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ItemFlagVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ItemFlagVOModel>>>() {};
    }

}
