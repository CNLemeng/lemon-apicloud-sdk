package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosOtherInoutReadDTOModel;

import com.nhsoft.neptune.api.domain.PosOtherInoutVOModel;

import java.util.*;

/**
 * read_30请求类
 * POS其他收支读取
 */
public class PosOtherinoutReadRequest implements ApiCloudRequest<PosOtherInoutReadDTOModel, PosOtherInoutVOModel> {

    private PosOtherInoutReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.otherinout.read";
    }

    @Override
    public PosOtherInoutReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosOtherInoutReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosOtherInoutVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosOtherInoutVOModel>>() {};
    }

}
