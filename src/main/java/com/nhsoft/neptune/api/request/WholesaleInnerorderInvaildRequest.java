package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsInnerOrderInvalidDTOModel;

import java.util.*;

/**
 * invalid请求类
 * 售后申请单作废
 */
public class WholesaleInnerorderInvaildRequest implements ApiCloudRequest<WhsInnerOrderInvalidDTOModel, Void> {

    private WhsInnerOrderInvalidDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.innerorder.invaild";
    }

    @Override
    public WhsInnerOrderInvalidDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsInnerOrderInvalidDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
