package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchContractIdDTOModel;

import com.nhsoft.neptune.api.domain.BranchContractFullyVOModel;

import java.util.*;

/**
 * read_30请求类
 * 门店合同管理读取
 */
public class SettlementBranchcontractReadRequest implements ApiCloudRequest<BranchContractIdDTOModel, BranchContractFullyVOModel> {

    private BranchContractIdDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.branchcontract.read";
    }

    @Override
    public BranchContractIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchContractIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BranchContractFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BranchContractFullyVOModel>>() {};
    }

}
