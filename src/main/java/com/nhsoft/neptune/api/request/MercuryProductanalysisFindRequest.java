package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MercuryProductAnalysisFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MercuryProductAnalysisVOModel;

import com.nhsoft.neptune.api.domain.MercuryProductAnalysisVOModel;

import java.util.*;

/**
 * findProductAnalysis请求类
 * 商城商品分析查询
 */
public class MercuryProductanalysisFindRequest implements ApiCloudRequest<MercuryProductAnalysisFindDTOModel, List<MercuryProductAnalysisVOModel>> {

    private MercuryProductAnalysisFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.productanalysis.find";
    }

    @Override
    public MercuryProductAnalysisFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MercuryProductAnalysisFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MercuryProductAnalysisVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MercuryProductAnalysisVOModel>>>() {};
    }

}
