package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleItemTabSaveDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleItemSpecVOModel;

import com.nhsoft.neptune.api.domain.WholesaleItemSpecVOModel;

import java.util.*;

/**
 * updateWholesaleSpecTab请求类
 * 批发商品规格属性更新
 */
public class BaseItemSpecTabWholesaleUpdateRequest implements ApiCloudRequest<WholesaleItemTabSaveDTOModel, List<WholesaleItemSpecVOModel>> {

    private WholesaleItemTabSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.spec.tab.wholesale.update";
    }

    @Override
    public WholesaleItemTabSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleItemTabSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleItemSpecVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleItemSpecVOModel>>>() {};
    }

}
