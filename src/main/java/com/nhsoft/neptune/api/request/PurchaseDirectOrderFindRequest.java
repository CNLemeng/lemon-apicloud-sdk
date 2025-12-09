package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DirectPurchaseOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.DirectPurchaseOrderVOModel;

import com.nhsoft.neptune.api.domain.DirectPurchaseOrderVOModel;

import java.util.*;

/**
 * findDirectPurchaseOrder请求类
 * 供应商直送单查询
 */
public class PurchaseDirectOrderFindRequest implements ApiCloudRequest<DirectPurchaseOrderFindDTOModel, List<DirectPurchaseOrderVOModel>> {

    private DirectPurchaseOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.direct.order.find";
    }

    @Override
    public DirectPurchaseOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DirectPurchaseOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<DirectPurchaseOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<DirectPurchaseOrderVOModel>>>() {};
    }

}
