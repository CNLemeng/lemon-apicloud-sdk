package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPaymentUpdateDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPaymentResponseDTOModel;

import java.util.*;

/**
 * updateSupplierPaymentSettlement请求类
 * 供应商付款单修改
 */
public class SettlementSupplierpaymentUpdateRequest implements ApiCloudRequest<SupplierPaymentUpdateDTOModel, SupplierPaymentResponseDTOModel> {

    private SupplierPaymentUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplierpayment.update";
    }

    @Override
    public SupplierPaymentUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPaymentUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierPaymentResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierPaymentResponseDTOModel>>() {};
    }

}
