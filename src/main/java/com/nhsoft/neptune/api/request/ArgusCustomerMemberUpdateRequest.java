package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberUpdateDTOModel;

import com.nhsoft.neptune.api.domain.MemberV2VOModel;

import java.util.*;

/**
 * updateMemberInfo请求类
 * 会员信息修改
 */
public class ArgusCustomerMemberUpdateRequest implements ApiCloudRequest<MemberUpdateDTOModel, MemberV2VOModel> {

    private MemberUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.customer.member.update";
    }

    @Override
    public MemberUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberV2VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberV2VOModel>>() {};
    }

}
