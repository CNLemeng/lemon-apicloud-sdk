package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.OfflinePointRuleVOModel;

import com.nhsoft.neptune.api.domain.OfflinePointRuleVOModel;

import java.util.*;

/**
 * findOfflinePointRule请求类
 * 线下积分规则查询
 */
public class ArgusOfflinePointruleFindRequest implements ApiCloudRequest<Void, List<OfflinePointRuleVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.offline.pointrule.find";
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
    public TypeReference<ApiCloudResponse<List<OfflinePointRuleVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OfflinePointRuleVOModel>>>() {};
    }

}
