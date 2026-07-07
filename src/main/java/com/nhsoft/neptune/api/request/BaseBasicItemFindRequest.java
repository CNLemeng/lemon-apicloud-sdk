package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemBatchDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemVOModel;

import com.nhsoft.neptune.api.domain.PosItemVOModel;

import java.util.*;

/**
 * findItems请求类
 * 根据商品编号查询商品档案
 */
public class BaseBasicItemFindRequest implements ApiCloudRequest<PosItemBatchDTOModel, List<PosItemVOModel>> {

    private PosItemBatchDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.item.find";
    }

    @Override
    public PosItemBatchDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosItemBatchDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemVOModel>>>() {};
    }

}
