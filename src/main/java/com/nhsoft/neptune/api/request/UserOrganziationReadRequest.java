package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterOrganizationIdDTOModel;

import com.nhsoft.neptune.api.domain.UserCenterOrganizationFullyVOModel;

import java.util.*;

/**
 * read_23请求类
 * 组织读取
 */
public class UserOrganziationReadRequest implements ApiCloudRequest<UserCenterOrganizationIdDTOModel, UserCenterOrganizationFullyVOModel> {

    private UserCenterOrganizationIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.organziation.read";
    }

    @Override
    public UserCenterOrganizationIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterOrganizationIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserCenterOrganizationFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserCenterOrganizationFullyVOModel>>() {};
    }

}
