package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutOrderOutBillNoFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import java.util.*;

/**
 * findByOutBillNo请求类
 * 根据外部单号查询调出单(不返回明细)
 */
public class ChainOutorderFindbyoutbillnoRequest implements ApiCloudRequest<OutOrderOutBillNoFindDTOModel, List<OutOrderV2DTOModel>> {

    private OutOrderOutBillNoFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.outorder.findbyoutbillno";
    }

    @Override
    public OutOrderOutBillNoFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OutOrderOutBillNoFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<OutOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OutOrderV2DTOModel>>>() {};
    }

}
