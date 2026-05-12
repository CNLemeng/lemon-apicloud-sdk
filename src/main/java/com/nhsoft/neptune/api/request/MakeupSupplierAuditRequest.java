package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MakeUpOrderSupplierAuditDTOModel;

import java.util.*;

/**
 * auditSupplierMakeUpOrder请求类
 * 供应商扣补单审核
 */
public class MakeupSupplierAuditRequest implements ApiCloudRequest<MakeUpOrderSupplierAuditDTOModel, Object> {

    private MakeUpOrderSupplierAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.makeup.supplier.audit";
    }

    @Override
    public MakeUpOrderSupplierAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MakeUpOrderSupplierAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
