package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserOpenAuthorityFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserOpenAuthorityVOModel;

import com.nhsoft.neptune.api.domain.UserOpenAuthorityVOModel;

import java.util.*;

/**
 * findRoles_1请求类
 * 开放应用权限查询
 */
public class UsercenterBasicOpenAuthoriryFindRequest implements ApiCloudRequest<UserOpenAuthorityFindDTOModel, List<UserOpenAuthorityVOModel>> {

    private UserOpenAuthorityFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.open.authoriry.find";
    }

    @Override
    public UserOpenAuthorityFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserOpenAuthorityFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserOpenAuthorityVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserOpenAuthorityVOModel>>>() {};
    }

}
