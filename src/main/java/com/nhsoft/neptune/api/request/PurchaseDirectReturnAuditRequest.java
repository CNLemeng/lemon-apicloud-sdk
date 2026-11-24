package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DirectPurchaseReturnReadDTOModel;

import com.nhsoft.neptune.api.domain.DirectPurchaseReturnVOModel;

import java.util.*;

/**
 * audit_8请求类
 * 供应商直退单审核
 */
public class PurchaseDirectReturnAuditRequest implements ApiCloudRequest<DirectPurchaseReturnReadDTOModel, DirectPurchaseReturnVOModel> {

    private DirectPurchaseReturnReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.direct.return.audit";
    }

    @Override
    public DirectPurchaseReturnReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DirectPurchaseReturnReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<DirectPurchaseReturnVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<DirectPurchaseReturnVOModel>>() {};
    }

}
