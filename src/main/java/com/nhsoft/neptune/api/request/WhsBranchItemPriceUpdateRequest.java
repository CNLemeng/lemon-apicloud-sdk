package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsBranchItemPriceSaveDTOModel;

import com.nhsoft.neptune.api.domain.WhsBranchItemPriceVOModel;

import java.util.*;

/**
 * update_11请求类
 * 批发门店商品价格查询
 */
public class WhsBranchItemPriceUpdateRequest implements ApiCloudRequest<WhsBranchItemPriceSaveDTOModel, WhsBranchItemPriceVOModel> {

    private WhsBranchItemPriceSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.branch.item.price.update";
    }

    @Override
    public WhsBranchItemPriceSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsBranchItemPriceSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsBranchItemPriceVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsBranchItemPriceVOModel>>() {};
    }

}
