package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.OnlinePointRuleVOModel;

import com.nhsoft.neptune.api.domain.OnlinePointRuleVOModel;

import java.util.*;

/**
 * findOnlinePointRule请求类
 * 线上积分规则查询
 */
public class ArgusOnlinePointruleFindRequest implements ApiCloudRequest<Void, List<OnlinePointRuleVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.online.pointrule.find";
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
    public TypeReference<ApiCloudResponse<List<OnlinePointRuleVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OnlinePointRuleVOModel>>>() {};
    }

}
