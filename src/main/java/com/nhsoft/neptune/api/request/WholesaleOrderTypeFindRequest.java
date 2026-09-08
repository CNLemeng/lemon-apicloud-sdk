package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.OrderWholesaleTypeVOModel;

import com.nhsoft.neptune.api.domain.OrderWholesaleTypeVOModel;

import java.util.*;

/**
 * findOrderType请求类
 * 批发单据类型查询
 */
public class WholesaleOrderTypeFindRequest implements ApiCloudRequest<Void, List<OrderWholesaleTypeVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.order.type.find";
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
    public TypeReference<ApiCloudResponse<List<OrderWholesaleTypeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OrderWholesaleTypeVOModel>>>() {};
    }

}
