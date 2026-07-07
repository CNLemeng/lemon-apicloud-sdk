package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DirectPurchaseOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.DirectPurchaseOrderVOModel;

import java.util.*;

/**
 * saveAndAuditDirectPurchaseOrder请求类
 * 供应商直送单新增并审核
 */
public class PurchaseDirectOrderSaveandauditRequest implements ApiCloudRequest<DirectPurchaseOrderSaveDTOModel, DirectPurchaseOrderVOModel> {

    private DirectPurchaseOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.direct.order.saveandaudit";
    }

    @Override
    public DirectPurchaseOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DirectPurchaseOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<DirectPurchaseOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<DirectPurchaseOrderVOModel>>() {};
    }

}
