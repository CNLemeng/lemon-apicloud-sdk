package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderIdDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderVOModel;

import java.util.*;

/**
 * read_32请求类
 * 采购询价读取
 */
public class PurchaeInquiryReadRequest implements ApiCloudRequest<PurchaseInquiryOrderIdDTOModel, PurchaseInquiryOrderVOModel> {

    private PurchaseInquiryOrderIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchae.inquiry.read";
    }

    @Override
    public PurchaseInquiryOrderIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseInquiryOrderIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseInquiryOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseInquiryOrderVOModel>>() {};
    }

}
