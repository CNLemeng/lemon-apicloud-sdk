package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryFindByLastEditTimeDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InventorySimpleVOModel;

import com.nhsoft.neptune.api.domain.InventorySimpleVOModel;

import java.util.*;

/**
 * findInventoryByLastEditTime请求类
 * 最后修改时间增量库存查询
 */
public class InventoryInventoryFindbylastedittimeRequest implements ApiCloudRequest<InventoryFindByLastEditTimeDTOModel, List<InventorySimpleVOModel>> {

    private InventoryFindByLastEditTimeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.inventory.findbylastedittime";
    }

    @Override
    public InventoryFindByLastEditTimeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InventoryFindByLastEditTimeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InventorySimpleVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InventorySimpleVOModel>>>() {};
    }

}
