package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderIdDTOModel;

import java.util.*;

/**
 * delete_10请求类
 * 采购询价删除
 */
public class PurchaeInquiryDeleteRequest implements ApiCloudRequest<PurchaseInquiryOrderIdDTOModel, Object> {

    private PurchaseInquiryOrderIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchae.inquiry.delete";
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
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
