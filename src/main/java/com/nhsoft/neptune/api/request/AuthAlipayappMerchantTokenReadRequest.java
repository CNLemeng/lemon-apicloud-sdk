package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AlipayAppTokenReadDTOModel;

import com.nhsoft.neptune.api.domain.AlipayMerchantAuthTokenVOModel;

import java.util.*;

/**
 * readAlipayAppAuthToken请求类
 * 读取商户支付宝小程序授权token
 */
public class AuthAlipayappMerchantTokenReadRequest implements ApiCloudRequest<AlipayAppTokenReadDTOModel, AlipayMerchantAuthTokenVOModel> {

    private AlipayAppTokenReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.auth.alipayapp.merchant.token.read";
    }

    @Override
    public AlipayAppTokenReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AlipayAppTokenReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AlipayMerchantAuthTokenVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AlipayMerchantAuthTokenVOModel>>() {};
    }

}
