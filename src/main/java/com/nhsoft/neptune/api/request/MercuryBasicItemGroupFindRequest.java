package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.BasicProductGroupVOModel;

import com.nhsoft.neptune.api.domain.BasicProductGroupVOModel;

import java.util.*;

/**
 * findProductGroup请求类
 * 商城商品分组查询
 */
public class MercuryBasicItemGroupFindRequest implements ApiCloudRequest<Void, List<BasicProductGroupVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.basic.item.group.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasicProductGroupVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasicProductGroupVOModel>>>() {};
    }

}
