package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCompanyPartnerCreateDTOModel;

import com.nhsoft.neptune.api.domain.UserCompanyPartnerVOModel;

import java.util.*;

/**
 * createPartner请求类
 * 合作伙伴用户新增
 */
public class UsercenterBasicPartnerSaveRequest implements ApiCloudRequest<UserCompanyPartnerCreateDTOModel, UserCompanyPartnerVOModel> {

    private UserCompanyPartnerCreateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.partner.save";
    }

    @Override
    public UserCompanyPartnerCreateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCompanyPartnerCreateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserCompanyPartnerVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserCompanyPartnerVOModel>>() {};
    }

}
