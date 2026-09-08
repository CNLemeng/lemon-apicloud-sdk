package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BaseItemTagFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BaseItemTagVOModel;

import com.nhsoft.neptune.api.domain.BaseItemTagVOModel;

import java.util.*;

/**
 * find_30请求类
 * 查询商品档案标签
 */
public class BaseBasicItemtagFindRequest implements ApiCloudRequest<BaseItemTagFindDTOModel, List<BaseItemTagVOModel>> {

    private BaseItemTagFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.itemtag.find";
    }

    @Override
    public BaseItemTagFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BaseItemTagFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BaseItemTagVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BaseItemTagVOModel>>>() {};
    }

}
