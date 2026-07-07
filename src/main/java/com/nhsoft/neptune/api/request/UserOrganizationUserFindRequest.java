package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterOrganizationUserFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserBasicUserVOModel;

import com.nhsoft.neptune.api.domain.UserBasicUserVOModel;

import java.util.*;

/**
 * findUserByOrganizationId请求类
 * 查询组织下的用户
 */
public class UserOrganizationUserFindRequest implements ApiCloudRequest<UserCenterOrganizationUserFindDTOModel, List<UserBasicUserVOModel>> {

    private UserCenterOrganizationUserFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.organization.user.find";
    }

    @Override
    public UserCenterOrganizationUserFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterOrganizationUserFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserBasicUserVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserBasicUserVOModel>>>() {};
    }

}
