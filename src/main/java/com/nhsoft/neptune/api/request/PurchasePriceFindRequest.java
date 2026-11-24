package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchasePriceFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PurchasePriceVOModel;

import com.nhsoft.neptune.api.domain.PurchasePriceVOModel;

import java.util.*;

/**
 * findPurchasePrice请求类
 * 采购单价查询
 */
public class PurchasePriceFindRequest implements ApiCloudRequest<PurchasePriceFindDTOModel, List<PurchasePriceVOModel>> {

    private PurchasePriceFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.price.find";
    }

    @Override
    public PurchasePriceFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchasePriceFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PurchasePriceVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PurchasePriceVOModel>>>() {};
    }

}
