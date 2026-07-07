package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientPreSettlementSaveDTOModel;

import com.nhsoft.neptune.api.domain.ClientPreSettlementVOModel;

import java.util.*;

/**
 * saveAndAudit_7请求类
 * 客户预收单新增并审核
 */
public class PresettlementClientSaveandauditRequest implements ApiCloudRequest<ClientPreSettlementSaveDTOModel, ClientPreSettlementVOModel> {

    private ClientPreSettlementSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.client.saveandaudit";
    }

    @Override
    public ClientPreSettlementSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientPreSettlementSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>>() {};
    }

}
