package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerLabelSaveDTOModel;

import com.nhsoft.neptune.api.domain.CustomerLabelVOModel;

import java.util.*;

/**
 * saveLabel请求类
 * 会员标签新增
 */
public class ArgusCustomerLabelSaveRequest implements ApiCloudRequest<CustomerLabelSaveDTOModel, CustomerLabelVOModel> {

    private CustomerLabelSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.label.save";
    }

    @Override
    public CustomerLabelSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerLabelSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CustomerLabelVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CustomerLabelVOModel>>() {};
    }

}
