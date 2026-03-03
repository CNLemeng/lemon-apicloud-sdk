package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.VipLevelProtocolAndDescReadDTOModel;

import com.nhsoft.neptune.api.domain.VipLevelProtocolAndDescVOModel;

import java.util.*;

/**
 * readProtocolDesc请求类
 * 读取会员等级协议描述
 */
public class ArgusViplevelProtocoldescReadRequest implements ApiCloudRequest<VipLevelProtocolAndDescReadDTOModel, VipLevelProtocolAndDescVOModel> {

    private VipLevelProtocolAndDescReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.viplevel.protocoldesc.read";
    }

    @Override
    public VipLevelProtocolAndDescReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(VipLevelProtocolAndDescReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<VipLevelProtocolAndDescVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<VipLevelProtocolAndDescVOModel>>() {};
    }

}
