package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MercurySaleOrderExpressSaveDTOModel;

import java.util.*;

/**
 * saveExpressForSaleOrder请求类
 * 订单新增快递单号
 */
public class MercurySaleorderExpressPackageSaveRequest implements ApiCloudRequest<MercurySaleOrderExpressSaveDTOModel, Object> {

    private MercurySaleOrderExpressSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.saleorder.express.package.save";
    }

    @Override
    public MercurySaleOrderExpressSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MercurySaleOrderExpressSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
