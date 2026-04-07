package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AllocationApplyOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.AllocationApplyOrderVOModel;

import java.util.*;

/**
 * save_21请求类
 * 库存转仓申请单保存
 */
public class InventoryAllocationApplySaveRequest implements ApiCloudRequest<AllocationApplyOrderSaveDTOModel, AllocationApplyOrderVOModel> {

    private AllocationApplyOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.allocation.apply.save";
    }

    @Override
    public AllocationApplyOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AllocationApplyOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AllocationApplyOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AllocationApplyOrderVOModel>>() {};
    }

}
