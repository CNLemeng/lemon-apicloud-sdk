package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.PosClientLabelVOModel;

import com.nhsoft.neptune.api.domain.PosClientLabelVOModel;

import java.util.*;

/**
 * find_32请求类
 * 批发客户标签查询
 */
public class WhsClientLabelFindRequest implements ApiCloudRequest<Void, List<PosClientLabelVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.client.label.find";
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
    public TypeReference<ApiCloudResponse<List<PosClientLabelVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosClientLabelVOModel>>>() {};
    }

}
