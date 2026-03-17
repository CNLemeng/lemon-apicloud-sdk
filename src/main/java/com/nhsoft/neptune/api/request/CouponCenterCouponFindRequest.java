package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CouponFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CouponVOModel;

import com.nhsoft.neptune.api.domain.CouponVOModel;

import java.util.*;

/**
 * findCoupon请求类
 * (券中心)查询消费券
 */
public class CouponCenterCouponFindRequest implements ApiCloudRequest<CouponFindDTOModel, List<CouponVOModel>> {

    private CouponFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupon.find";
    }

    @Override
    public CouponFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CouponFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CouponVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CouponVOModel>>>() {};
    }

}
