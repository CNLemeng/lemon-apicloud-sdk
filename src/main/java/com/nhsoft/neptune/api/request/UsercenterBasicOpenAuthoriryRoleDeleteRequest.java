package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserOpenAuthorityRoleSaveDTOModel;

import java.util.*;

/**
 * deleteRoleAuthority请求类
 * 角色解綁开放应用权限
 */
public class UsercenterBasicOpenAuthoriryRoleDeleteRequest implements ApiCloudRequest<UserOpenAuthorityRoleSaveDTOModel, Void> {

    private UserOpenAuthorityRoleSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.open.authoriry.role.delete";
    }

    @Override
    public UserOpenAuthorityRoleSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserOpenAuthorityRoleSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
