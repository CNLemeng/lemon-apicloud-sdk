package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OtherInoutShareOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.OtherInoutShareOrderFullyVOModel;

import java.util.*;

/**
 * update_28请求类
 * 费用分摊单新增或修改
 */
public class OtherinoutshareorderUpdateRequest implements ApiCloudRequest<OtherInoutShareOrderUpdateDTOModel, OtherInoutShareOrderFullyVOModel> {

    private OtherInoutShareOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinoutshareorder.update";
    }

    @Override
    public OtherInoutShareOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OtherInoutShareOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OtherInoutShareOrderFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OtherInoutShareOrderFullyVOModel>>() {};
    }

}
