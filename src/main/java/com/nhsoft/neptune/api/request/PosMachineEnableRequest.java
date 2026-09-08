package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RetailPosMachineBatchEnableDTOModel;

import java.util.*;

/**
 * enablePosMachine请求类
 * 销售终端确认或取消
 */
public class PosMachineEnableRequest implements ApiCloudRequest<RetailPosMachineBatchEnableDTOModel, Object> {

    private RetailPosMachineBatchEnableDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.machine.enable";
    }

    @Override
    public RetailPosMachineBatchEnableDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RetailPosMachineBatchEnableDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
