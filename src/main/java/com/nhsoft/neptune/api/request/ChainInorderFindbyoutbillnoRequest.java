package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InOrderOutBillNoFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import java.util.*;

/**
 * findByOutBillNo_2请求类
 * 根据外部单号查询调入单
 */
public class ChainInorderFindbyoutbillnoRequest implements ApiCloudRequest<InOrderOutBillNoFindDTOModel, List<InOrderV2DTOModel>> {

    private InOrderOutBillNoFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inorder.findbyoutbillno";
    }

    @Override
    public InOrderOutBillNoFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InOrderOutBillNoFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InOrderV2DTOModel>>>() {};
    }

}
