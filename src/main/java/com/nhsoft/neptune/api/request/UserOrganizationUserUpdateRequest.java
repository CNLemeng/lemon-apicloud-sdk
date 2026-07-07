package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterOrganizationUserUpdateDTOModel;

import java.util.*;

/**
 * updatedUserByOrganization请求类
 * 更新组织下的用户
 */
public class UserOrganizationUserUpdateRequest implements ApiCloudRequest<UserCenterOrganizationUserUpdateDTOModel, Object> {

    private UserCenterOrganizationUserUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.organization.user.update";
    }

    @Override
    public UserCenterOrganizationUserUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterOrganizationUserUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
