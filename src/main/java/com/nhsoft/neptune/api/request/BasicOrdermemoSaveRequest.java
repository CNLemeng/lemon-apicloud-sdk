package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderMemoSaveDTOModel;

import com.nhsoft.neptune.api.domain.OrderMemoVOModel;

import java.util.*;

/**
 * save_38请求类
 * 单据附加备注新增
 */
public class BasicOrdermemoSaveRequest implements ApiCloudRequest<OrderMemoSaveDTOModel, OrderMemoVOModel> {

    private OrderMemoSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.ordermemo.save";
    }

    @Override
    public OrderMemoSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OrderMemoSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OrderMemoVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OrderMemoVOModel>>() {};
    }

}
