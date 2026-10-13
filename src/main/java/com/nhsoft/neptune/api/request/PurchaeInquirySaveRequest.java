package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderVOModel;

import java.util.*;

/**
 * save_19请求类
 * 采购询价新增
 */
public class PurchaeInquirySaveRequest implements ApiCloudRequest<PurchaseInquiryOrderSaveDTOModel, PurchaseInquiryOrderVOModel> {

    private PurchaseInquiryOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchae.inquiry.save";
    }

    @Override
    public PurchaseInquiryOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseInquiryOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseInquiryOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseInquiryOrderVOModel>>() {};
    }

}
