package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPaymentAuditDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPaymentResponseDTOModel;

import java.util.*;

/**
 * auditSupplierPaymentSettlement请求类
 * 供应商付款单审核
 */
public class SettlementSupplierpaymentAuditRequest implements ApiCloudRequest<SupplierPaymentAuditDTOModel, SupplierPaymentResponseDTOModel> {

    private SupplierPaymentAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplierpayment.audit";
    }

    @Override
    public SupplierPaymentAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPaymentAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierPaymentResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierPaymentResponseDTOModel>>() {};
    }

}
