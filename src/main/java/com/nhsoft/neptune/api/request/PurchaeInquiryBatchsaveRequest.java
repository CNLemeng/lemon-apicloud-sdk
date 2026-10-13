package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderBatchSaveDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderFullyVOModel;

import com.nhsoft.neptune.api.domain.PurchaseInquiryOrderFullyVOModel;

import java.util.*;

/**
 * batchSave请求类
 * 采购询价批量制单
 */
public class PurchaeInquiryBatchsaveRequest implements ApiCloudRequest<PurchaseInquiryOrderBatchSaveDTOModel, List<PurchaseInquiryOrderFullyVOModel>> {

    private PurchaseInquiryOrderBatchSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchae.inquiry.batchsave";
    }

    @Override
    public PurchaseInquiryOrderBatchSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseInquiryOrderBatchSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PurchaseInquiryOrderFullyVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PurchaseInquiryOrderFullyVOModel>>>() {};
    }

}
