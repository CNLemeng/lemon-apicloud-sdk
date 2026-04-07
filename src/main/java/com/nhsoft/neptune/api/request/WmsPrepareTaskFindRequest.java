package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsPrepareTaskFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsPrepareTaskVOModel;

import com.nhsoft.neptune.api.domain.WmsPrepareTaskVOModel;

import java.util.*;

/**
 * find_4请求类
 * 非标配货任务查询
 */
public class WmsPrepareTaskFindRequest implements ApiCloudRequest<WmsPrepareTaskFindDTOModel, List<WmsPrepareTaskVOModel>> {

    private WmsPrepareTaskFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.prepare.task.find";
    }

    @Override
    public WmsPrepareTaskFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsPrepareTaskFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsPrepareTaskVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsPrepareTaskVOModel>>>() {};
    }

}
