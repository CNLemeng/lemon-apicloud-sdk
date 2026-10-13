package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchItemRealPriceFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchItemRealPriceVOModel;

import com.nhsoft.neptune.api.domain.BranchItemRealPriceVOModel;

import java.util.*;

/**
 * salePriceFind_1请求类
 * 门店零售价查询
 */
public class RetailBranchitemRealpriceFindRequest implements ApiCloudRequest<BranchItemRealPriceFindDTOModel, List<BranchItemRealPriceVOModel>> {

    private BranchItemRealPriceFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.branchitem.realprice.find";
    }

    @Override
    public BranchItemRealPriceFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchItemRealPriceFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchItemRealPriceVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchItemRealPriceVOModel>>>() {};
    }

}
