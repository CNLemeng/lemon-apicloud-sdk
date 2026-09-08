package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsBranchItemPriceFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WhsBranchItemPriceVOModel;

import com.nhsoft.neptune.api.domain.WhsBranchItemPriceVOModel;

import java.util.*;

/**
 * find_21请求类
 * 批发门店商品价格查询
 */
public class WhsBranchItemPriceFindRequest implements ApiCloudRequest<WhsBranchItemPriceFindDTOModel, List<WhsBranchItemPriceVOModel>> {

    private WhsBranchItemPriceFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.branch.item.price.find";
    }

    @Override
    public WhsBranchItemPriceFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsBranchItemPriceFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WhsBranchItemPriceVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WhsBranchItemPriceVOModel>>>() {};
    }

}
