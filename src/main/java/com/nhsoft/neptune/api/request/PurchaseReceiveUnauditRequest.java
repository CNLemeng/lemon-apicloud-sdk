package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveOrderUnAuditDTOModel;

import java.util.*;

/**
 * receiveOrderUnAudit请求类
 * 收货单反审核
 */
public class PurchaseReceiveUnauditRequest implements ApiCloudRequest<ReceiveOrderUnAuditDTOModel, Void> {

    private ReceiveOrderUnAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.receive.unaudit";
    }

    @Override
    public ReceiveOrderUnAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveOrderUnAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
