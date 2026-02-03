package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentIdDTOModel;

import java.util.*;

/**
 * delete_7请求类
 * 商品调价删除
 */
public class BasicPriceadjDeleteRequest implements ApiCloudRequest<PriceAdjustmentIdDTOModel, Void> {

    private PriceAdjustmentIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.delete";
    }

    @Override
    public PriceAdjustmentIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
