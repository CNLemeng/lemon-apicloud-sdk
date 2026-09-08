package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsOutOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.WmsOutOrderVOModel;

import java.util.*;

/**
 * save_1请求类
 * 出库单保存
 */
public class WmsOutOrderSaveRequest implements ApiCloudRequest<WmsOutOrderSaveDTOModel, WmsOutOrderVOModel> {

    private WmsOutOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.out.order.save";
    }

    @Override
    public WmsOutOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsOutOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WmsOutOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WmsOutOrderVOModel>>() {};
    }

}
