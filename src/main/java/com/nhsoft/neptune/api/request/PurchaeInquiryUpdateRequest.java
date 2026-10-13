package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderVOModel;

import java.util.*;

/**
 * update_20请求类
 * 采购询价修改
 */
public class PurchaeInquiryUpdateRequest implements ApiCloudRequest<PurchaseInquiryOrderUpdateDTOModel, PurchaseInquiryOrderVOModel> {

    private PurchaseInquiryOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchae.inquiry.update";
    }

    @Override
    public PurchaseInquiryOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseInquiryOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseInquiryOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseInquiryOrderVOModel>>() {};
    }

}
