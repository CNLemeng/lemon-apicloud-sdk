package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleReturnBatchIdDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import java.util.*;

/**
 * findByIds请求类
 * 根据单据号查询批发退货单
 */
public class WholesaleReturnFindbyidsRequest implements ApiCloudRequest<WholesaleReturnBatchIdDTOModel, List<WholesaleReturnVOModel>> {

    private WholesaleReturnBatchIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.return.findbyids";
    }

    @Override
    public WholesaleReturnBatchIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleReturnBatchIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesaleReturnVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesaleReturnVOModel>>>() {};
    }

}
