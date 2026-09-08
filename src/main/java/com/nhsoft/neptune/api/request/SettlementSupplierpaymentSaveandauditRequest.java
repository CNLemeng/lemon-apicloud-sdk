package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPaymentSaveDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPaymentResponseDTOModel;

import java.util.*;

/**
 * saveAndAuditSupplierPaymentSettlement请求类
 * 供应商付款单新增
 */
public class SettlementSupplierpaymentSaveandauditRequest implements ApiCloudRequest<SupplierPaymentSaveDTOModel, SupplierPaymentResponseDTOModel> {

    private SupplierPaymentSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplierpayment.saveandaudit";
    }

    @Override
    public SupplierPaymentSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPaymentSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierPaymentResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierPaymentResponseDTOModel>>() {};
    }

}
