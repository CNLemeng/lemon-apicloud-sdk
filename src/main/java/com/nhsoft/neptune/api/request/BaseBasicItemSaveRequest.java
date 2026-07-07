package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemSaveDTOModel;

import com.nhsoft.neptune.api.domain.PosItemVOModel;

import java.util.*;

/**
 * saveItem请求类
 * 新增商品档案
 */
public class BaseBasicItemSaveRequest implements ApiCloudRequest<PosItemSaveDTOModel, PosItemVOModel> {

    private PosItemSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.item.save";
    }

    @Override
    public PosItemSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemVOModel>>() {};
    }

}
