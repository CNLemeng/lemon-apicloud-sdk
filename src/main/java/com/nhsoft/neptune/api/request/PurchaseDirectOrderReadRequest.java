package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DirectPurchaseOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.DirectPurchaseOrderVOModel;

import java.util.*;

/**
 * readDirectPurchaseOrder请求类
 * 供应商直送单读取
 */
public class PurchaseDirectOrderReadRequest implements ApiCloudRequest<DirectPurchaseOrderReadDTOModel, DirectPurchaseOrderVOModel> {

    private DirectPurchaseOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.direct.order.read";
    }

    @Override
    public DirectPurchaseOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DirectPurchaseOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<DirectPurchaseOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<DirectPurchaseOrderVOModel>>() {};
    }

}
