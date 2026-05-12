package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleInnerOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleInnerOrderVOModel;

import java.util.*;

/**
 * updateV2请求类
 * 售后申请单修改
 */
public class WholesaleInnerorderUpdatev2Request implements ApiCloudRequest<WholesaleInnerOrderUpdateDTOModel, WholesaleInnerOrderVOModel> {

    private WholesaleInnerOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.innerorder.update/v2";
    }

    @Override
    public WholesaleInnerOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleInnerOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleInnerOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleInnerOrderVOModel>>() {};
    }

}
