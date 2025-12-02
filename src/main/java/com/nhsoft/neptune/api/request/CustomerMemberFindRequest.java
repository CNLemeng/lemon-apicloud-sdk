package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MemberDetailV1VOModel;

import com.nhsoft.neptune.api.domain.MemberDetailV1VOModel;

import java.util.*;

/**
 * findMembers请求类
 * 查询全渠道会员信息
 */
public class CustomerMemberFindRequest implements ApiCloudRequest<MemberFindDTOModel, List<MemberDetailV1VOModel>> {

    private MemberFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.find";
    }

    @Override
    public MemberFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MemberDetailV1VOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MemberDetailV1VOModel>>>() {};
    }

}
