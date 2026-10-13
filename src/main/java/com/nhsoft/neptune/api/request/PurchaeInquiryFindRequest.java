package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderVOModel;

import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderVOModel;

import java.util.*;

/**
 * find_38请求类
 * 采购询价查询
 */
public class PurchaeInquiryFindRequest implements ApiCloudRequest<PurchaseInquiryOrderFindDTOModel, List<PurchaseInquiryOrderVOModel>> {

    private PurchaseInquiryOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchae.inquiry.find";
    }

    @Override
    public PurchaseInquiryOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseInquiryOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PurchaseInquiryOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PurchaseInquiryOrderVOModel>>>() {};
    }

}
