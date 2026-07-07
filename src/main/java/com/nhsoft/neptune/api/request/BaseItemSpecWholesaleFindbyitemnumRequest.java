package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemReadDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleItemSpecVOModel;

import com.nhsoft.neptune.api.domain.WholesaleItemSpecVOModel;

import java.util.*;

/**
 * findWholesaleSpecByItemNum请求类
 * 根据商品编码查询批发商品规格
 */
public class BaseItemSpecWholesaleFindbyitemnumRequest implements ApiCloudRequest<PosItemReadDTOModel, List<WholesaleItemSpecVOModel>> {

    private PosItemReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.spec.wholesale.findbyitemnum";
    }

    @Override
    public PosItemReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleItemSpecVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleItemSpecVOModel>>>() {};
    }

}
