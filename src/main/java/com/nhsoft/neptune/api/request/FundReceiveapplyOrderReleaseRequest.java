package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveApplyOrderReleaseDTOModel;

import java.util.*;

/**
 * releaseReceiveApplyOrder请求类
 * 全量释放收款冻结单金额
 */
public class FundReceiveapplyOrderReleaseRequest implements ApiCloudRequest<ReceiveApplyOrderReleaseDTOModel, Object> {

    private ReceiveApplyOrderReleaseDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receiveapply.order.release";
    }

    @Override
    public ReceiveApplyOrderReleaseDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveApplyOrderReleaseDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
