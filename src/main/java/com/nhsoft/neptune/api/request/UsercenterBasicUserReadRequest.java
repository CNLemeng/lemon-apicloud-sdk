package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicUserReadDTOModel;

import com.nhsoft.neptune.api.domain.UserBasicUserVOModel;

import java.util.*;

/**
 * readBasicCompanyUser请求类
 * 用户读取
 */
public class UsercenterBasicUserReadRequest implements ApiCloudRequest<UserBasicUserReadDTOModel, UserBasicUserVOModel> {

    private UserBasicUserReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.user.read";
    }

    @Override
    public UserBasicUserReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicUserReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserBasicUserVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserBasicUserVOModel>>() {};
    }

}
