package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.VipLevelFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.VipLevelVOModel;

import com.nhsoft.neptune.api.domain.VipLevelVOModel;

import java.util.*;

/**
 * findVipLevel请求类
 * 会员等级查询
 */
public class ArgusViplevelFindRequest implements ApiCloudRequest<VipLevelFindDTOModel, List<VipLevelVOModel>> {

    private VipLevelFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.viplevel.find";
    }

    @Override
    public VipLevelFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(VipLevelFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<VipLevelVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<VipLevelVOModel>>>() {};
    }

}
