package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerLabelGroupFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CustomerLabelGroupVOModel;

import com.nhsoft.neptune.api.domain.CustomerLabelGroupVOModel;

import java.util.*;

/**
 * findLabelGroup请求类
 * 会员标签分组查询
 */
public class ArgusCustomerLabelGroupFindRequest implements ApiCloudRequest<CustomerLabelGroupFindDTOModel, List<CustomerLabelGroupVOModel>> {

    private CustomerLabelGroupFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.label.group.find";
    }

    @Override
    public CustomerLabelGroupFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerLabelGroupFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CustomerLabelGroupVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CustomerLabelGroupVOModel>>>() {};
    }

}
