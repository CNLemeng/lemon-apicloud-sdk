package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SmsBasicBatchSendByTemplateDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SmsBasicMessageVOModel;

import com.nhsoft.neptune.api.domain.SmsBasicMessageVOModel;

import java.util.*;

/**
 * batchSendMessage请求类
 * 根据模板群发短信
 */
public class UsercenterMessageBatchSendRequest implements ApiCloudRequest<SmsBasicBatchSendByTemplateDTOModel, List<SmsBasicMessageVOModel>> {

    private SmsBasicBatchSendByTemplateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.message.batch.send";
    }

    @Override
    public SmsBasicBatchSendByTemplateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SmsBasicBatchSendByTemplateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SmsBasicMessageVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SmsBasicMessageVOModel>>>() {};
    }

}
