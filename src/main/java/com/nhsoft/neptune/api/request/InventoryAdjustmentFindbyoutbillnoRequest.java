package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AdjustmentOrderFindByOutBilNoDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AdjustmentOrderVOModel;

import com.nhsoft.neptune.api.domain.AdjustmentOrderVOModel;

import java.util.*;

/**
 * findByOutBillNo请求类
 * 根据外部单号查询库存调整单
 */
public class InventoryAdjustmentFindbyoutbillnoRequest implements ApiCloudRequest<AdjustmentOrderFindByOutBilNoDTOModel, List<AdjustmentOrderVOModel>> {

    private AdjustmentOrderFindByOutBilNoDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.adjustment.findbyoutbillno";
    }

    @Override
    public AdjustmentOrderFindByOutBilNoDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AdjustmentOrderFindByOutBilNoDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AdjustmentOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AdjustmentOrderVOModel>>>() {};
    }

}
