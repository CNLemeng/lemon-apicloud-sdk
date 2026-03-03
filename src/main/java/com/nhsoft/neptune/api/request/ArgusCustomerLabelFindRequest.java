package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerLabelFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CustomerLabelVOModel;

import com.nhsoft.neptune.api.domain.CustomerLabelVOModel;

import java.util.*;

/**
 * findCustomerLabel请求类
 * 会员标签查询
 */
public class ArgusCustomerLabelFindRequest implements ApiCloudRequest<CustomerLabelFindDTOModel, List<CustomerLabelVOModel>> {

    private CustomerLabelFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.label.find";
    }

    @Override
    public CustomerLabelFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerLabelFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CustomerLabelVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CustomerLabelVOModel>>>() {};
    }

}
