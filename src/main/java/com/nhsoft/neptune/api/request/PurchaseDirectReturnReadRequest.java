package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DirectPurchaseReturnReadDTOModel;

import com.nhsoft.neptune.api.domain.DirectPurchaseReturnVOModel;

import java.util.*;

/**
 * readDirectReturnOrder请求类
 * 供应商直退单读取
 */
public class PurchaseDirectReturnReadRequest implements ApiCloudRequest<DirectPurchaseReturnReadDTOModel, DirectPurchaseReturnVOModel> {

    private DirectPurchaseReturnReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.direct.return.read";
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
