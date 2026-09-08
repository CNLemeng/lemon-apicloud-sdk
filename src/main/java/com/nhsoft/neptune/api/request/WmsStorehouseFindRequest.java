package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsStorehouseFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsStorehouseVOModel;

import com.nhsoft.neptune.api.domain.WmsStorehouseVOModel;

import java.util.*;

/**
 * update请求类
 * wms仓库查询
 */
public class WmsStorehouseFindRequest implements ApiCloudRequest<WmsStorehouseFindDTOModel, List<WmsStorehouseVOModel>> {

    private WmsStorehouseFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.storehouse.find";
    }

    @Override
    public WmsStorehouseFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsStorehouseFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsStorehouseVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsStorehouseVOModel>>>() {};
    }

}
