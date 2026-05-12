package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleInnerOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleInnerOrderVOModel;

import java.util.*;

/**
 * saveAndAuditV2请求类
 * 售后申请单新增并审核
 */
public class WholesaleInnerorderSaveandauditv2Request implements ApiCloudRequest<WholesaleInnerOrderSaveDTOModel, WholesaleInnerOrderVOModel> {

    private WholesaleInnerOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.innerorder.saveandaudit/v2";
    }

    @Override
    public WholesaleInnerOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleInnerOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleInnerOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleInnerOrderVOModel>>() {};
    }

}
