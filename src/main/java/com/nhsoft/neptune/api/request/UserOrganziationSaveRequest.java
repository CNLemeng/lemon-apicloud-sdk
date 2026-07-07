package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterOrganizationSaveDTOModel;

import com.nhsoft.neptune.api.domain.UserCenterOrganizationSimpleVOModel;

import java.util.*;

/**
 * save_8请求类
 * 组织新增
 */
public class UserOrganziationSaveRequest implements ApiCloudRequest<UserCenterOrganizationSaveDTOModel, UserCenterOrganizationSimpleVOModel> {

    private UserCenterOrganizationSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.organziation.save";
    }

    @Override
    public UserCenterOrganizationSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterOrganizationSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserCenterOrganizationSimpleVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserCenterOrganizationSimpleVOModel>>() {};
    }

}
