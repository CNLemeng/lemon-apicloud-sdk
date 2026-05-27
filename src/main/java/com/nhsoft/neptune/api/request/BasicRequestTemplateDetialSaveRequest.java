package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestTemplateBranchItemBatchSaveDTOModel;

import java.util.*;

/**
 * saveRequestTemplateDetail请求类
 * 门店要货模板增加商品明细
 */
public class BasicRequestTemplateDetialSaveRequest implements ApiCloudRequest<RequestTemplateBranchItemBatchSaveDTOModel, Void> {

    private RequestTemplateBranchItemBatchSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.request.template.detial.save";
    }

    @Override
    public RequestTemplateBranchItemBatchSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestTemplateBranchItemBatchSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
