package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterOrganizationUpdateDTOModel;

import com.nhsoft.neptune.api.domain.UserCenterOrganizationSimpleVOModel;

import java.util.*;

/**
 * update_11请求类
 * 组织修改
 */
public class UserOrganziationUpdateRequest implements ApiCloudRequest<UserCenterOrganizationUpdateDTOModel, UserCenterOrganizationSimpleVOModel> {

    private UserCenterOrganizationUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.organziation.update";
    }

    @Override
    public UserCenterOrganizationUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterOrganizationUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserCenterOrganizationSimpleVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserCenterOrganizationSimpleVOModel>>() {};
    }

}
