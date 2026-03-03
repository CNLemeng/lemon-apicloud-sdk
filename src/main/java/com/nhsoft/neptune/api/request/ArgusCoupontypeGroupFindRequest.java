package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.CouponTypeGroupVOModel;

import com.nhsoft.neptune.api.domain.CouponTypeGroupVOModel;

import java.util.*;

/**
 * findCouponTypeGroup请求类
 * 消费券类型分组查询
 */
public class ArgusCoupontypeGroupFindRequest implements ApiCloudRequest<Void, List<CouponTypeGroupVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.coupontype.group.find";
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
    public TypeReference<ApiCloudResponse<List<CouponTypeGroupVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CouponTypeGroupVOModel>>>() {};
    }

}
