package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerIdDTOModel;

import com.nhsoft.neptune.api.domain.CustomerPayCodeVOModel;

import java.util.*;

/**
 * generateCustomerPayCode请求类
 * 会员生成付款码
 */
public class ArgusCustomerPaycodeGenerateRequest implements ApiCloudRequest<CustomerIdDTOModel, CustomerPayCodeVOModel> {

    private CustomerIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.paycode.generate";
    }

    @Override
    public CustomerIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CustomerPayCodeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CustomerPayCodeVOModel>>() {};
    }

}
