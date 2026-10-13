package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CollectionReceiveTaskFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CollectionReceiveTaskVOModel;

import com.nhsoft.neptune.api.domain.CollectionReceiveTaskVOModel;

import java.util.*;

/**
 * findCollectionReceiveTask请求类
 * 生鲜-采配收货任务查询
 */
public class WmsFreshReceiveTaskFindRequest implements ApiCloudRequest<CollectionReceiveTaskFindDTOModel, List<CollectionReceiveTaskVOModel>> {

    private CollectionReceiveTaskFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.fresh.receive.task.find";
    }

    @Override
    public CollectionReceiveTaskFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CollectionReceiveTaskFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CollectionReceiveTaskVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CollectionReceiveTaskVOModel>>>() {};
    }

}
