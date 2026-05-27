package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestTemplateBranchItemBatchDeleteDTOModel;

import java.util.*;

/**
 * deleteRequestTemplateDetail请求类
 * 门店要货模板删除商品明细
 */
public class BasicRequestTemplateDetialDeleteRequest implements ApiCloudRequest<RequestTemplateBranchItemBatchDeleteDTOModel, Void> {

    private RequestTemplateBranchItemBatchDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.request.template.detial.delete";
    }

    @Override
    public RequestTemplateBranchItemBatchDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestTemplateBranchItemBatchDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
