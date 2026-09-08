package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.VipLevelBenefitsVOModel;

import com.nhsoft.neptune.api.domain.VipLevelBenefitsVOModel;

import java.util.*;

/**
 * find_48请求类
 * 会员等级权益查询
 */
public class ArgusCustomerVipLevelBenefitsFindRequest implements ApiCloudRequest<Void, List<VipLevelBenefitsVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.vip.level.benefits.find";
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
    public TypeReference<ApiCloudResponse<List<VipLevelBenefitsVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<VipLevelBenefitsVOModel>>>() {};
    }

}
