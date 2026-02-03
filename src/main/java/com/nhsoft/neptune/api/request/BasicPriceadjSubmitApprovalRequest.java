package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentSubmitApprovalDTOModel;

import com.nhsoft.neptune.api.domain.WorkFlowOrderInstanceVOModel;

import java.util.*;

/**
 * summitApproval请求类
 * 商品调价提交审批
 */
public class BasicPriceadjSubmitApprovalRequest implements ApiCloudRequest<PriceAdjustmentSubmitApprovalDTOModel, WorkFlowOrderInstanceVOModel> {

    private PriceAdjustmentSubmitApprovalDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.submitApproval";
    }

    @Override
    public PriceAdjustmentSubmitApprovalDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentSubmitApprovalDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WorkFlowOrderInstanceVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WorkFlowOrderInstanceVOModel>>() {};
    }

}
