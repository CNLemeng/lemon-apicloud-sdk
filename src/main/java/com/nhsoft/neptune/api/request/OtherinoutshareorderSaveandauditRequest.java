package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OtherInoutShareOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.OtherInoutShareOrderFullyVOModel;

import java.util.*;

/**
 * saveAndAudit_12请求类
 * 费用分摊单保存并审核
 */
public class OtherinoutshareorderSaveandauditRequest implements ApiCloudRequest<OtherInoutShareOrderSaveDTOModel, OtherInoutShareOrderFullyVOModel> {

    private OtherInoutShareOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinoutshareorder.saveandaudit";
    }

    @Override
    public OtherInoutShareOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OtherInoutShareOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OtherInoutShareOrderFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OtherInoutShareOrderFullyVOModel>>() {};
    }

}
