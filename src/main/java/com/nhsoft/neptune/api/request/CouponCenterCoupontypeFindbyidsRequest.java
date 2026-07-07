package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CouponTypeBatchIdDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MemberCouponTypeFullyVOModel;

import com.nhsoft.neptune.api.domain.MemberCouponTypeFullyVOModel;

import java.util.*;

/**
 * readCouponType请求类
 * 消费券类型批量读取
 */
public class CouponCenterCoupontypeFindbyidsRequest implements ApiCloudRequest<CouponTypeBatchIdDTOModel, List<MemberCouponTypeFullyVOModel>> {

    private CouponTypeBatchIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupontype.findbyids";
    }

    @Override
    public CouponTypeBatchIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CouponTypeBatchIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MemberCouponTypeFullyVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MemberCouponTypeFullyVOModel>>>() {};
    }

}
