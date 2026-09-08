package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PlatformSchedulingFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PlatformSchedulingVOModel;

import com.nhsoft.neptune.api.domain.PlatformSchedulingVOModel;

import java.util.*;

/**
 * find_5请求类
 * 入仓申请查询
 */
public class WmsPlatformSchedulingFindRequest implements ApiCloudRequest<PlatformSchedulingFindDTOModel, List<PlatformSchedulingVOModel>> {

    private PlatformSchedulingFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.platform.scheduling.find";
    }

    @Override
    public PlatformSchedulingFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PlatformSchedulingFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PlatformSchedulingVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PlatformSchedulingVOModel>>>() {};
    }

}
