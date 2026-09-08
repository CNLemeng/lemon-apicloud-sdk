package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCompanyPartnerFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserCompanyPartnerVOModel;

import com.nhsoft.neptune.api.domain.UserCompanyPartnerVOModel;

import java.util.*;

/**
 * pagePartner请求类
 * 合作伙伴用户查询
 */
public class UsercenterBasicPartnerFindRequest implements ApiCloudRequest<UserCompanyPartnerFindDTOModel, List<UserCompanyPartnerVOModel>> {

    private UserCompanyPartnerFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.partner.find";
    }

    @Override
    public UserCompanyPartnerFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCompanyPartnerFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserCompanyPartnerVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserCompanyPartnerVOModel>>>() {};
    }

}
