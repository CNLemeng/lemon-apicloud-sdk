package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCompanyPartnerUpdateDTOModel;

import com.nhsoft.neptune.api.domain.UserCompanyPartnerVOModel;

import java.util.*;

/**
 * updatePartner请求类
 * 合作伙伴用户修改
 */
public class UsercenterBasicPartnerUpdateRequest implements ApiCloudRequest<UserCompanyPartnerUpdateDTOModel, UserCompanyPartnerVOModel> {

    private UserCompanyPartnerUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.partner.update";
    }

    @Override
    public UserCompanyPartnerUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCompanyPartnerUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserCompanyPartnerVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserCompanyPartnerVOModel>>() {};
    }

}
