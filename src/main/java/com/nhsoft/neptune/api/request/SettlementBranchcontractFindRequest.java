package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchContractFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchContractVOModel;

import com.nhsoft.neptune.api.domain.BranchContractVOModel;

import java.util.*;

/**
 * find_34请求类
 * 门店合同管理查询
 */
public class SettlementBranchcontractFindRequest implements ApiCloudRequest<BranchContractFindDTOModel, List<BranchContractVOModel>> {

    private BranchContractFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.branchcontract.find";
    }

    @Override
    public BranchContractFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchContractFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchContractVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchContractVOModel>>>() {};
    }

}
