package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MercurySaleOrderExpressUpdateDTOModel;

import java.util.*;

/**
 * updateExpressForSaleOrder请求类
 * 订单修改快递单号
 */
public class MercurySaleorderExpressPackageUpdateRequest implements ApiCloudRequest<MercurySaleOrderExpressUpdateDTOModel, Object> {

    private MercurySaleOrderExpressUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.saleorder.express.package.update";
    }

    @Override
    public MercurySaleOrderExpressUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MercurySaleOrderExpressUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
