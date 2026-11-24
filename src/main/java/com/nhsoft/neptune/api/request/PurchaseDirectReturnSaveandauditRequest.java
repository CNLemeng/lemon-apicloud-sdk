package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DirectPurchaseReturnSaveDTOModel;

import com.nhsoft.neptune.api.domain.DirectPurchaseReturnVOModel;

import java.util.*;

/**
 * saveAndAudit_6请求类
 * 供应商直退单保存并审核
 */
public class PurchaseDirectReturnSaveandauditRequest implements ApiCloudRequest<DirectPurchaseReturnSaveDTOModel, DirectPurchaseReturnVOModel> {

    private DirectPurchaseReturnSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.direct.return.saveandaudit";
    }

    @Override
    public DirectPurchaseReturnSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DirectPurchaseReturnSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<DirectPurchaseReturnVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<DirectPurchaseReturnVOModel>>() {};
    }

}
