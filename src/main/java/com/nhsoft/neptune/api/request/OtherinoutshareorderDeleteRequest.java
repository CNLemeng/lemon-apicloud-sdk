package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OtherInoutShareOrderIdDTOModel;

import java.util.*;

/**
 * delete_10请求类
 * 费用分摊单删除
 */
public class OtherinoutshareorderDeleteRequest implements ApiCloudRequest<OtherInoutShareOrderIdDTOModel, Object> {

    private OtherInoutShareOrderIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinoutshareorder.delete";
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
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
