package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderIdOperateDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderVOModel;

import java.util.*;

/**
 * audit_7请求类
 * 采购询价审核
 */
public class PurchaeInquiryAuditRequest implements ApiCloudRequest<PurchaseInquiryOrderIdOperateDTOModel, PurchaseInquiryOrderVOModel> {

    private PurchaseInquiryOrderIdOperateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchae.inquiry.audit";
    }

    @Override
    public PurchaseInquiryOrderIdOperateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseInquiryOrderIdOperateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseInquiryOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseInquiryOrderVOModel>>() {};
    }

}
