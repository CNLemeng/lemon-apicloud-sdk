package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPreSettlementOutBillNoUpdateDTOModel;

import java.util.*;

/**
 * updateOutBillNo_1请求类
 * 供应商预付单修改外部单号
 */
public class PresettlementSupplierOutbillnoUpdateRequest implements ApiCloudRequest<SupplierPreSettlementOutBillNoUpdateDTOModel, Void> {

    private SupplierPreSettlementOutBillNoUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.supplier.outbillno.update";
    }

    @Override
    public SupplierPreSettlementOutBillNoUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPreSettlementOutBillNoUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
