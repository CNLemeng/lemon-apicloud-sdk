package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WmsOutOrderVOModel;

import java.util.*;

/**
 * update_1请求类
 * 出库单更新
 */
public class WmsOutOrderUpdateRequest implements ApiCloudRequest<WmsOutOrderUpdateDTOModel, WmsOutOrderVOModel> {

    private WmsOutOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.order.update";
    }

    @Override
    public WmsOutOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsOutOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsOutOrderVOModel>>() {};
    }

}
