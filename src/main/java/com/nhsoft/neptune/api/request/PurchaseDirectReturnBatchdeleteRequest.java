package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DirectPurchaseReturnBatchDeleteDTOModel;

import java.util.*;

/**
 * batchDelete_1请求类
 * 供应商直退单批量删除
 */
public class PurchaseDirectReturnBatchdeleteRequest implements ApiCloudRequest<DirectPurchaseReturnBatchDeleteDTOModel, Object> {

    private DirectPurchaseReturnBatchDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.direct.return.batchdelete";
    }

    @Override
    public DirectPurchaseReturnBatchDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DirectPurchaseReturnBatchDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
