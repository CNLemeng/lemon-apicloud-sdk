package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserCenterEmployeeBatchDeleteDTOModel;

import java.util.*;

/**
 * batchDelete请求类
 * 档案中心员工批量删除
 */
public class UserEmployeeBatchdeleteRequest implements ApiCloudRequest<UserCenterEmployeeBatchDeleteDTOModel, Object> {

    private UserCenterEmployeeBatchDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.employee.batchdelete";
    }

    @Override
    public UserCenterEmployeeBatchDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserCenterEmployeeBatchDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
