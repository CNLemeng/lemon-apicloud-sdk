package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerGrowthUpdateDTOModel;

import java.util.*;

/**
 * updateGrowth请求类
 * 会员成长值修改
 */
public class ArgusCustomerGrowthUpdateRequest implements ApiCloudRequest<CustomerGrowthUpdateDTOModel, Void> {

    private CustomerGrowthUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.growth.update";
    }

    @Override
    public CustomerGrowthUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerGrowthUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
