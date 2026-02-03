package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentReadDTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentVOModel;

import java.util.*;

/**
 * read_35请求类
 * 商品调价读取
 */
public class BasicPriceadjReadRequest implements ApiCloudRequest<PriceAdjustmentReadDTOModel, PriceAdjustmentVOModel> {

    private PriceAdjustmentReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.read";
    }

    @Override
    public PriceAdjustmentReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PriceAdjustmentVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PriceAdjustmentVOModel>>() {};
    }

}
