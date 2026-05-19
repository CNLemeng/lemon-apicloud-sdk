package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerLabelUnbindDTOModel;

import java.util.*;

/**
 * unbindCustomerLabel请求类
 * 会员删除标签
 */
public class ArgusCustomerLabelUnbindRequest implements ApiCloudRequest<CustomerLabelUnbindDTOModel, Void> {

    private CustomerLabelUnbindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.label.unbind";
    }

    @Override
    public CustomerLabelUnbindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerLabelUnbindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
