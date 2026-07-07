package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BaseCenterBrandFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BaseCenterBrandVOModel;

import com.nhsoft.neptune.api.domain.BaseCenterBrandVOModel;

import java.util.*;

/**
 * find_25请求类
 * 商品品牌查询
 */
public class BaseItemBrandFindRequest implements ApiCloudRequest<BaseCenterBrandFindDTOModel, List<BaseCenterBrandVOModel>> {

    private BaseCenterBrandFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.brand.find";
    }

    @Override
    public BaseCenterBrandFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BaseCenterBrandFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BaseCenterBrandVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BaseCenterBrandVOModel>>>() {};
    }

}
