package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PosItemVOModel;

import java.util.*;

/**
 * updateItem请求类
 * 修改商品档案
 */
public class BaseBasicItemUpdateRequest implements ApiCloudRequest<PosItemUpdateDTOModel, PosItemVOModel> {

    private PosItemUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.item.update";
    }

    @Override
    public PosItemUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemVOModel>>() {};
    }

}
