package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.PointConvertVOModel;

import com.nhsoft.neptune.api.domain.PointConvertVOModel;

import java.util.*;

/**
 * findPointConvert请求类
 * 积分兑换物查询
 */
public class PointConvertFindRequest implements ApiCloudRequest<Void, List<PointConvertVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.point.convert.find";
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
    public TypeReference<ApiCloudResponse<List<PointConvertVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PointConvertVOModel>>>() {};
    }

}
