package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MsgNoticeSaveDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MsgNoticeVOModel;

import com.nhsoft.neptune.api.domain.MsgNoticeVOModel;

import java.util.*;

/**
 * save_8请求类
 * 发送站内信
 */
public class UserMsgNoticeSendRequest implements ApiCloudRequest<MsgNoticeSaveDTOModel, List<MsgNoticeVOModel>> {

    private MsgNoticeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.user.msg.notice.send";
    }

    @Override
    public MsgNoticeSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MsgNoticeSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MsgNoticeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MsgNoticeVOModel>>>() {};
    }

}
