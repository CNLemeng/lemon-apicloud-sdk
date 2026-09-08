package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OtherInoutShareOrderIdDTOModel;

import com.nhsoft.neptune.api.domain.OtherInoutShareOrderFullyVOModel;

import java.util.*;

/**
 * read_36请求类
 * 费用分摊单读取
 */
public class OtherinoutshareorderReadRequest implements ApiCloudRequest<OtherInoutShareOrderIdDTOModel, OtherInoutShareOrderFullyVOModel> {

    private OtherInoutShareOrderIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinoutshareorder.read";
    }

    @Override
    public OtherInoutShareOrderIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OtherInoutShareOrderIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OtherInoutShareOrderFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OtherInoutShareOrderFullyVOModel>>() {};
    }

}
