package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierSettlementOutBillNoUpdateDTOModel;

import java.util.*;

/**
 * updateOutBillNo请求类
 * 供应商结算单更新外部单号
 */
public class SettlementSupplierOutbillnoUpdateRequest implements ApiCloudRequest<SupplierSettlementOutBillNoUpdateDTOModel, Void> {

    private SupplierSettlementOutBillNoUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplier.outbillno.update";
    }

    @Override
    public SupplierSettlementOutBillNoUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierSettlementOutBillNoUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
