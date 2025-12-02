package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayLogFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PayLogDTOModel;

import com.nhsoft.neptune.api.domain.PayLogDTOModel;

import java.util.*;

/**
 * findPaylog请求类
 * 支付日志查询
 */
public class AllpayBasicPaylogFindRequest implements ApiCloudRequest<PayLogFindDTOModel, List<PayLogDTOModel>> {

    private PayLogFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.allpay.basic.paylog.find";
    }

    @Override
    public PayLogFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PayLogFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PayLogDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PayLogDTOModel>>>() {};
    }

}
