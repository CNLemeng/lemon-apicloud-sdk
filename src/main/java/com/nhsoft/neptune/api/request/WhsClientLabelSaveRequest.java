package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleClientLabelSaveDTOModel;

import com.nhsoft.neptune.api.domain.PosClientLabelVOModel;

import java.util.*;

/**
 * save_7请求类
 * 批发客户标签新增
 */
public class WhsClientLabelSaveRequest implements ApiCloudRequest<WholesaleClientLabelSaveDTOModel, PosClientLabelVOModel> {

    private WholesaleClientLabelSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.client.label.save";
    }

    @Override
    public WholesaleClientLabelSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleClientLabelSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosClientLabelVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosClientLabelVOModel>>() {};
    }

}
