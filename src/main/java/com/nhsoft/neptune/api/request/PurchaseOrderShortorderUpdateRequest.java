package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseOrderShortNoUpdateDTOModel;

import java.util.*;

/**
 * updateShortOrder请求类
 * 采购订单修改简写单号
 */
public class PurchaseOrderShortorderUpdateRequest implements ApiCloudRequest<PurchaseOrderShortNoUpdateDTOModel, Object> {

    private PurchaseOrderShortNoUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.order.shortorder.update";
    }

    @Override
    public PurchaseOrderShortNoUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseOrderShortNoUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
