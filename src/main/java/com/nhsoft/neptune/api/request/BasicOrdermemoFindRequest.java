package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderMemoFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.OrderMemoVOModel;

import com.nhsoft.neptune.api.domain.OrderMemoVOModel;

import java.util.*;

/**
 * find_50请求类
 * 单据附加备注查询
 */
public class BasicOrdermemoFindRequest implements ApiCloudRequest<OrderMemoFindDTOModel, List<OrderMemoVOModel>> {

    private OrderMemoFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.ordermemo.find";
    }

    @Override
    public OrderMemoFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OrderMemoFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<OrderMemoVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OrderMemoVOModel>>>() {};
    }

}
