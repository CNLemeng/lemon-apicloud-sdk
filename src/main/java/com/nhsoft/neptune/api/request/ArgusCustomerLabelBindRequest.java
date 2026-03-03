package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerLabelBatchBindDTOModel;

import java.util.*;

/**
 * bindCustomerLabel请求类
 * 会员批量打标签
 */
public class ArgusCustomerLabelBindRequest implements ApiCloudRequest<CustomerLabelBatchBindDTOModel, Void> {

    private CustomerLabelBatchBindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.label.bind";
    }

    @Override
    public CustomerLabelBatchBindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerLabelBatchBindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
