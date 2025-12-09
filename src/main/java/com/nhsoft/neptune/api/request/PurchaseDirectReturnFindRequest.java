package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DirectPurchaseReturnFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.DirectPurchaseReturnVOModel;

import com.nhsoft.neptune.api.domain.DirectPurchaseReturnVOModel;

import java.util.*;

/**
 * findDirectReturnOrder请求类
 * 供应商直退单查询
 */
public class PurchaseDirectReturnFindRequest implements ApiCloudRequest<DirectPurchaseReturnFindDTOModel, List<DirectPurchaseReturnVOModel>> {

    private DirectPurchaseReturnFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.direct.return.find";
    }

    @Override
    public DirectPurchaseReturnFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DirectPurchaseReturnFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<DirectPurchaseReturnVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<DirectPurchaseReturnVOModel>>>() {};
    }

}
