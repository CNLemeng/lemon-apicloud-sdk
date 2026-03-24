package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleClientLabelUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PosClientLabelVOModel;

import java.util.*;

/**
 * update_9请求类
 * 批发客户标签修改
 */
public class WhsClientLabelUpdateRequest implements ApiCloudRequest<WholesaleClientLabelUpdateDTOModel, PosClientLabelVOModel> {

    private WholesaleClientLabelUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.client.label.update";
    }

    @Override
    public WholesaleClientLabelUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleClientLabelUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosClientLabelVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosClientLabelVOModel>>() {};
    }

}
