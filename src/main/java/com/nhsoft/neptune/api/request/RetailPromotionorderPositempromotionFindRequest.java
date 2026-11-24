package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PromotionOrderPosItemPromotionFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PromotionOrderPosItemPromotionVOModel;

import com.nhsoft.neptune.api.domain.PromotionOrderPosItemPromotionVOModel;

import java.util.*;

/**
 * find_25请求类
 * 促销中心商品促销查询
 */
public class RetailPromotionorderPositempromotionFindRequest implements ApiCloudRequest<PromotionOrderPosItemPromotionFindDTOModel, List<PromotionOrderPosItemPromotionVOModel>> {

    private PromotionOrderPosItemPromotionFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.promotionorder.positempromotion.find";
    }

    @Override
    public PromotionOrderPosItemPromotionFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PromotionOrderPosItemPromotionFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PromotionOrderPosItemPromotionVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PromotionOrderPosItemPromotionVOModel>>>() {};
    }

}
