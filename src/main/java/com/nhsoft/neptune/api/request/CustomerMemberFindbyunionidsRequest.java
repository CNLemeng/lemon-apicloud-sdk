package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerFindByUnionIdDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MemberWithUnionVOModel;

import com.nhsoft.neptune.api.domain.MemberWithUnionVOModel;

import java.util.*;

/**
 * readMemberByPhone请求类
 * 根据unionid查询会员
 */
public class CustomerMemberFindbyunionidsRequest implements ApiCloudRequest<CustomerFindByUnionIdDTOModel, List<MemberWithUnionVOModel>> {

    private CustomerFindByUnionIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.findbyunionids";
    }

    @Override
    public CustomerFindByUnionIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerFindByUnionIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MemberWithUnionVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MemberWithUnionVOModel>>>() {};
    }

}
