package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RefundReasonVOModel;

import java.util.*;

/**
 * findRefundReason请求类
 * 新零售订单退款原因查询
 */
public class MercuryBasicRefundreasonsFindRequest implements ApiCloudRequest<Void, RefundReasonVOModel> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.basic.refundreasons.find";
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
    public TypeReference<ApiCloudResponse<RefundReasonVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RefundReasonVOModel>>() {};
    }

}
