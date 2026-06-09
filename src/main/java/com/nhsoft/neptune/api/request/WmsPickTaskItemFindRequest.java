package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PickTaskItemFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PickTaskItemVOModel;

import com.nhsoft.neptune.api.domain.PickTaskItemVOModel;

import java.util.*;

/**
 * find_5请求类
 * 拣货计划-商品汇总
 */
public class WmsPickTaskItemFindRequest implements ApiCloudRequest<PickTaskItemFindDTOModel, List<PickTaskItemVOModel>> {

    private PickTaskItemFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.pick.task.item.find";
    }

    @Override
    public PickTaskItemFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PickTaskItemFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PickTaskItemVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PickTaskItemVOModel>>>() {};
    }

}
