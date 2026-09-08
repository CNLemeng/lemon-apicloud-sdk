package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.AdjustmentReasonVOModel;

import com.nhsoft.neptune.api.domain.AdjustmentReasonVOModel;

import java.util.*;

/**
 * adjustmentReasonFind请求类
 * 调整原因查询
 */
public class InventoryAdjustmentreasonFindRequest implements ApiCloudRequest<Void, List<AdjustmentReasonVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.adjustmentreason.find";
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
    public TypeReference<ApiCloudResponse<List<AdjustmentReasonVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AdjustmentReasonVOModel>>>() {};
    }

}
