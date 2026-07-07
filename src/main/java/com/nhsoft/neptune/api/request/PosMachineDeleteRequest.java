package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RetailPosMachineDelDTOModel;

import java.util.*;

/**
 * deletePosMachine请求类
 * 销售终端删除
 */
public class PosMachineDeleteRequest implements ApiCloudRequest<RetailPosMachineDelDTOModel, Void> {

    private RetailPosMachineDelDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.machine.delete";
    }

    @Override
    public RetailPosMachineDelDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RetailPosMachineDelDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
