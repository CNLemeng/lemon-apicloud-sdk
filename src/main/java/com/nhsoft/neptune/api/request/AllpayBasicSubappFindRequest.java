package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.SubPayAppDTOModel;

import com.nhsoft.neptune.api.domain.SubPayAppDTOModel;

import java.util.*;

/**
 * findAllByAppid请求类
 * 子商户查询
 */
public class AllpayBasicSubappFindRequest implements ApiCloudRequest<Void, List<SubPayAppDTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.allpay.basic.subapp.find";
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
    public TypeReference<ApiCloudResponse<List<SubPayAppDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SubPayAppDTOModel>>>() {};
    }

}
