package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosOrderFindByOrderNosDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosOrderVOModel;

import com.nhsoft.neptune.api.domain.PosOrderVOModel;

import java.util.*;

/**
 * findByIds_2请求类
 * 根据单据号列表查询销售单
 */
public class PosOrderFindbyordernosRequest implements ApiCloudRequest<PosOrderFindByOrderNosDTOModel, List<PosOrderVOModel>> {

    private PosOrderFindByOrderNosDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.order.findbyordernos";
    }

    @Override
    public PosOrderFindByOrderNosDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosOrderFindByOrderNosDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosOrderVOModel>>>() {};
    }

}
