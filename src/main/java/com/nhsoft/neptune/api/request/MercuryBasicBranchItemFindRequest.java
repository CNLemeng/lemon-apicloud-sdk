package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProductVariantBranchFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ProductVariantBranchVOModel;

import com.nhsoft.neptune.api.domain.ProductVariantBranchVOModel;

import java.util.*;

/**
 * findBranchProductVariantList请求类
 * 商城门店商品规格查询
 */
public class MercuryBasicBranchItemFindRequest implements ApiCloudRequest<ProductVariantBranchFindDTOModel, List<ProductVariantBranchVOModel>> {

    private ProductVariantBranchFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.basic.branch.item.find";
    }

    @Override
    public ProductVariantBranchFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProductVariantBranchFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ProductVariantBranchVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ProductVariantBranchVOModel>>>() {};
    }

}
