package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleReturnSaveDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import java.util.*;

/**
 * wholesaleReturnSaveV2请求类
 * 批发退货单新增
 */
public class WholesaleReturnSavev2Request implements ApiCloudRequest<WholesaleReturnSaveDTOModel, WholesaleReturnVOModel> {

    private WholesaleReturnSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.return.save/v2";
    }

    @Override
    public WholesaleReturnSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleReturnSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleReturnVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleReturnVOModel>>() {};
    }

}
