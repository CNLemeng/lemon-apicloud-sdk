package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AmaUserFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AppUserResponseDTOModel;

import com.nhsoft.neptune.api.domain.AppUserResponseDTOModel;

import java.util.*;

/**
 * userinfoFind请求类
 * 用户信息查询
 */
public class BasicUserFindRequest implements ApiCloudRequest<AmaUserFindDTOModel, List<AppUserResponseDTOModel>> {

    private AmaUserFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.user.find";
    }

    @Override
    public AmaUserFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AmaUserFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AppUserResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AppUserResponseDTOModel>>>() {};
    }

}
