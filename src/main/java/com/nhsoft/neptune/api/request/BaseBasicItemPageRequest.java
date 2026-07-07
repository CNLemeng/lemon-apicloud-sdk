package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemVOModel;

import com.nhsoft.neptune.api.domain.PosItemVOModel;

import java.util.*;

/**
 * findItem请求类
 * 查询商品档案
 */
public class BaseBasicItemPageRequest implements ApiCloudRequest<PosItemFindDTOModel, List<PosItemVOModel>> {

    private PosItemFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.item.page";
    }

    @Override
    public PosItemFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemVOModel>>>() {};
    }

}
