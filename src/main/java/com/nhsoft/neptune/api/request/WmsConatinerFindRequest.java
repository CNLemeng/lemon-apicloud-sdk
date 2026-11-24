package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsContainerFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsContainerVOModel;

import com.nhsoft.neptune.api.domain.WmsContainerVOModel;

import java.util.*;

/**
 * findContainer请求类
 * 容器查询
 */
public class WmsConatinerFindRequest implements ApiCloudRequest<WmsContainerFindDTOModel, List<WmsContainerVOModel>> {

    private WmsContainerFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.conatiner.find";
    }

    @Override
    public WmsContainerFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsContainerFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsContainerVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsContainerVOModel>>>() {};
    }

}
