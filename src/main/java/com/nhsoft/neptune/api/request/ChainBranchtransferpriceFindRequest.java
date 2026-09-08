package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreMatrixBranchTransferFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.StoreMatrixBranchTransferVOModel;

import com.nhsoft.neptune.api.domain.StoreMatrixBranchTransferVOModel;

import java.util.*;

/**
 * findBranchTransferPrice请求类
 * 查询门店配送设定价
 */
public class ChainBranchtransferpriceFindRequest implements ApiCloudRequest<StoreMatrixBranchTransferFindDTOModel, List<StoreMatrixBranchTransferVOModel>> {

    private StoreMatrixBranchTransferFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.branchtransferprice.find";
    }

    @Override
    public StoreMatrixBranchTransferFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreMatrixBranchTransferFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<StoreMatrixBranchTransferVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<StoreMatrixBranchTransferVOModel>>>() {};
    }

}
