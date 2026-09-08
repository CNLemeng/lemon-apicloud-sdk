package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OtherInoutShareOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.OtherInoutShareOrderVOModel;

import com.nhsoft.neptune.api.domain.OtherInoutShareOrderVOModel;

import java.util.*;

/**
 * find_39请求类
 * 费用分摊单查询
 */
public class OtherinoutshareorderFindRequest implements ApiCloudRequest<OtherInoutShareOrderFindDTOModel, List<OtherInoutShareOrderVOModel>> {

    private OtherInoutShareOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinoutshareorder.find";
    }

    @Override
    public OtherInoutShareOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OtherInoutShareOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<OtherInoutShareOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OtherInoutShareOrderVOModel>>>() {};
    }

}
