package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleReturnAuditDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleReturnVOModel;

import java.util.*;

/**
 * wholesaleReturnAuditV2请求类
 * 批发退货单审核
 */
public class WholesaleReturnAuditv2Request implements ApiCloudRequest<WholesaleReturnAuditDTOModel, WholesaleReturnVOModel> {

    private WholesaleReturnAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.return.audit/v2";
    }

    @Override
    public WholesaleReturnAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleReturnAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleReturnVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleReturnVOModel>>() {};
    }

}
