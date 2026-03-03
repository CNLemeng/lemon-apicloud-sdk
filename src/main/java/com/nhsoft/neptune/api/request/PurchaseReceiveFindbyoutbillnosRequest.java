package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveOrderBatchIdDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ReceiveOrderFindV2DTOModel;

import com.nhsoft.neptune.api.domain.ReceiveOrderFindV2DTOModel;

import java.util.*;

/**
 * findByOutBillNos请求类
 * 根据外部单号查询收货单
 */
public class PurchaseReceiveFindbyoutbillnosRequest implements ApiCloudRequest<ReceiveOrderBatchIdDTOModel, List<ReceiveOrderFindV2DTOModel>> {

    private ReceiveOrderBatchIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.receive.findbyoutbillnos";
    }

    @Override
    public ReceiveOrderBatchIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveOrderBatchIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ReceiveOrderFindV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ReceiveOrderFindV2DTOModel>>>() {};
    }

}
