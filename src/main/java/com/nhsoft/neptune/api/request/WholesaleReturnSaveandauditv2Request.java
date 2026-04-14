package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleReturnSaveDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import java.util.*;

/**
 * wholesaleReturnSaveAndAuditV2请求类
 * 批发退货单保存加审核
 */
public class WholesaleReturnSaveandauditv2Request implements ApiCloudRequest<WholesaleReturnSaveDTOModel, WholesaleReturnVOModel> {

    private WholesaleReturnSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.return.saveandaudit/v2";
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
