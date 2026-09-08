package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseOrderIdDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseOrderShortNoVOModel;

import java.util.*;

/**
 * readShortOrder请求类
 * 查询采购订单简写单号
 */
public class PurchaseOrderShortorderReadRequest implements ApiCloudRequest<PurchaseOrderIdDTOModel, PurchaseOrderShortNoVOModel> {

    private PurchaseOrderIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.order.shortorder.read";
    }

    @Override
    public PurchaseOrderIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseOrderIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseOrderShortNoVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseOrderShortNoVOModel>>() {};
    }

}
