package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleOrderBatchIdDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import java.util.*;

/**
 * findByIds_1请求类
 * 根据单据号查询批发销售单
 */
public class WholesaleOrderFindbyidsRequest implements ApiCloudRequest<WholesaleOrderBatchIdDTOModel, List<WholesaleOrderVOModel>> {

    private WholesaleOrderBatchIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.order.findbyids";
    }

    @Override
    public WholesaleOrderBatchIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleOrderBatchIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleOrderVOModel>>>() {};
    }

}
