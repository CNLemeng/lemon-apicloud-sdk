package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import java.util.*;

/**
 * findPayType请求类
 * 支付类型查询
 */
public class AllpayBasicPaytypeFindRequest implements ApiCloudRequest<Void, List<String>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.allpay.basic.paytype.find";
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
    public TypeReference<ApiCloudResponse<List<String>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<String>>>() {};
    }

}
