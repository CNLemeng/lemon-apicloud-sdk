package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemFlagSaveDTOModel;

import java.util.*;

/**
 * read_6请求类
 * 商品查询模板新增
 */
public class BaseItemFlagSaveRequest implements ApiCloudRequest<ItemFlagSaveDTOModel, Object> {

    private ItemFlagSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.flag.save";
    }

    @Override
    public ItemFlagSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemFlagSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
