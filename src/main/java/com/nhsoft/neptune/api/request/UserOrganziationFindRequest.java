package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterOrganizationFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserCenterOrganizationVOModel;

import com.nhsoft.neptune.api.domain.UserCenterOrganizationVOModel;

import java.util.*;

/**
 * find_21请求类
 * 组织查询
 */
public class UserOrganziationFindRequest implements ApiCloudRequest<UserCenterOrganizationFindDTOModel, List<UserCenterOrganizationVOModel>> {

    private UserCenterOrganizationFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.organziation.find";
    }

    @Override
    public UserCenterOrganizationFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterOrganizationFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserCenterOrganizationVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserCenterOrganizationVOModel>>>() {};
    }

}
