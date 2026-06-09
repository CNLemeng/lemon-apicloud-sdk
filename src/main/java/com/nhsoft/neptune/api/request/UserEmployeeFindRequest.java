package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterEmployeeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserCenterEmployeeVOModel;

import com.nhsoft.neptune.api.domain.UserCenterEmployeeVOModel;

import java.util.*;

/**
 * find_21请求类
 * 档案中心员工查询
 */
public class UserEmployeeFindRequest implements ApiCloudRequest<UserCenterEmployeeFindDTOModel, List<UserCenterEmployeeVOModel>> {

    private UserCenterEmployeeFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.employee.find";
    }

    @Override
    public UserCenterEmployeeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterEmployeeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserCenterEmployeeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserCenterEmployeeVOModel>>>() {};
    }

}
