package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemReadDTOModel;

import com.nhsoft.neptune.api.domain.PosItemVOModel;

import java.util.*;

/**
 * readItem请求类
 * 读取商品档案
 */
public class BaseBasicItemReadRequest implements ApiCloudRequest<PosItemReadDTOModel, PosItemVOModel> {

    private PosItemReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.item.read";
    }

    @Override
    public PosItemReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemVOModel>>() {};
    }

}
