package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InventoryV2DTOModel;

import com.nhsoft.neptune.api.domain.InventoryV2DTOModel;

import java.util.*;

/**
 * findInventoryV2请求类
 * 库存查询
 */
public class InventoryInventoryFindv2Request implements ApiCloudRequest<InventoryFindV2DTOModel, List<InventoryV2DTOModel>> {

    private InventoryFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.inventory.find/v2";
    }

    @Override
    public InventoryFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InventoryFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InventoryV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InventoryV2DTOModel>>>() {};
    }

}
