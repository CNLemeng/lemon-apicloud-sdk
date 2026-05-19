package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterEmployeeSaveDTOModel;

import com.nhsoft.neptune.api.domain.UserCenterEmployeeVOModel;

import java.util.*;

/**
 * save_10请求类
 * 档案中心员工新增
 */
public class UserEmployeeSaveRequest implements ApiCloudRequest<UserCenterEmployeeSaveDTOModel, UserCenterEmployeeVOModel> {

    private UserCenterEmployeeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.employee.save";
    }

    @Override
    public UserCenterEmployeeSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterEmployeeSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserCenterEmployeeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserCenterEmployeeVOModel>>() {};
    }

}
