package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponTypeReadDTOModel;

import com.nhsoft.neptune.api.domain.MemberCouponTypeFullyVOModel;

import java.util.*;

/**
 * readCouponType_1请求类
 * 消费券类型读取
 */
public class CouponCenterCoupontypeReadRequest implements ApiCloudRequest<MemberCouponTypeReadDTOModel, MemberCouponTypeFullyVOModel> {

    private MemberCouponTypeReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupontype.read";
    }

    @Override
    public MemberCouponTypeReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponTypeReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberCouponTypeFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberCouponTypeFullyVOModel>>() {};
    }

}
