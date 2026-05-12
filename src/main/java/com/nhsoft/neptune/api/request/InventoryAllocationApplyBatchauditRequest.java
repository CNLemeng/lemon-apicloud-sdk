package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AllocationApplyOrderBatchAuditDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AllocationApplyOrderVOModel;

import com.nhsoft.neptune.api.domain.AllocationApplyOrderVOModel;

import java.util.*;

/**
 * batchAudit请求类
 * 库存转仓申请单批量审核
 */
public class InventoryAllocationApplyBatchauditRequest implements ApiCloudRequest<AllocationApplyOrderBatchAuditDTOModel, List<AllocationApplyOrderVOModel>> {

    private AllocationApplyOrderBatchAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.allocation.apply.batchaudit";
    }

    @Override
    public AllocationApplyOrderBatchAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AllocationApplyOrderBatchAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AllocationApplyOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AllocationApplyOrderVOModel>>>() {};
    }

}
