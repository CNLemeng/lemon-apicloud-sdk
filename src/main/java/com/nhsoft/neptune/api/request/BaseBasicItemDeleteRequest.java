package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemDeleteDTOModel;

import java.util.*;

/**
 * delete_6请求类
 * 刪除商品档案
 */
public class BaseBasicItemDeleteRequest implements ApiCloudRequest<PosItemDeleteDTOModel, Object> {

    private PosItemDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.item.delete";
    }

    @Override
    public PosItemDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
