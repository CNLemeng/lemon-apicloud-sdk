package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerLabelUpdateDTOModel;

import com.nhsoft.neptune.api.domain.CustomerLabelVOModel;

import java.util.*;

/**
 * updateLabel请求类
 * 会员标签修改
 */
public class ArgusCustomerLabelUpdateRequest implements ApiCloudRequest<CustomerLabelUpdateDTOModel, CustomerLabelVOModel> {

    private CustomerLabelUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.label.update";
    }

    @Override
    public CustomerLabelUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerLabelUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CustomerLabelVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CustomerLabelVOModel>>() {};
    }

}
