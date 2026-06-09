package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosBookReadDTOModel;

import com.nhsoft.neptune.api.domain.PosBookVOModel;

import java.util.*;

/**
 * read_23请求类
 * 呼叫中心订单保存
 */
public class RetailPosBookReadRequest implements ApiCloudRequest<PosBookReadDTOModel, PosBookVOModel> {

    private PosBookReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.retail.pos.book.read";
    }

    @Override
    public PosBookReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosBookReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosBookVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosBookVOModel>>() {};
    }

}
