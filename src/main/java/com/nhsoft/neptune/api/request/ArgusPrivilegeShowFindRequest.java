package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.PrivilegeShowParamVOModel;

import com.nhsoft.neptune.api.domain.PrivilegeShowParamVOModel;

import java.util.*;

/**
 * findPrivilegeShow请求类
 * 查询会员展示特权
 */
public class ArgusPrivilegeShowFindRequest implements ApiCloudRequest<Void, List<PrivilegeShowParamVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.privilege.show.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PrivilegeShowParamVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PrivilegeShowParamVOModel>>>() {};
    }

}
