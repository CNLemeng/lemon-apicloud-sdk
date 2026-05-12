package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterEmployeeCategoryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserCenterEmployeeCategoryVOModel;

import com.nhsoft.neptune.api.domain.UserCenterEmployeeCategoryVOModel;

import java.util.*;

/**
 * findCategory请求类
 * 档案中心员工分类查询
 */
public class UserEmployeeCategoryFindRequest implements ApiCloudRequest<UserCenterEmployeeCategoryFindDTOModel, List<UserCenterEmployeeCategoryVOModel>> {

    private UserCenterEmployeeCategoryFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.employee.category.find";
    }

    @Override
    public UserCenterEmployeeCategoryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterEmployeeCategoryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserCenterEmployeeCategoryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserCenterEmployeeCategoryVOModel>>>() {};
    }

}
