package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasicProductFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BasicProductVOModel;

import com.nhsoft.neptune.api.domain.BasicProductVOModel;

import java.util.*;

/**
 * findProduct请求类
 * 商城商品查询
 */
public class MercuryBasicItemFindRequest implements ApiCloudRequest<BasicProductFindDTOModel, List<BasicProductVOModel>> {

    private BasicProductFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.basic.item.find";
    }

    @Override
    public BasicProductFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasicProductFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasicProductVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasicProductVOModel>>>() {};
    }

}
