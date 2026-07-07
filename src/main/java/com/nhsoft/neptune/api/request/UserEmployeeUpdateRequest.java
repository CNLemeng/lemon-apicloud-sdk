package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterEmployeeUpdateDTOModel;

import com.nhsoft.neptune.api.domain.UserCenterEmployeeVOModel;

import java.util.*;

/**
 * save_10请求类
 * 档案中心员工修改
 */
public class UserEmployeeUpdateRequest implements ApiCloudRequest<UserCenterEmployeeUpdateDTOModel, UserCenterEmployeeVOModel> {

    private UserCenterEmployeeUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.employee.update";
    }

    @Override
    public UserCenterEmployeeUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterEmployeeUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserCenterEmployeeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserCenterEmployeeVOModel>>() {};
    }

}
