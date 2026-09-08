package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MaterialFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MaterialVOModel;

import com.nhsoft.neptune.api.domain.MaterialVOModel;

import java.util.*;

/**
 * find_29请求类
 * 查询档案素材
 */
public class BaseBasicMaterialFindRequest implements ApiCloudRequest<MaterialFindDTOModel, List<MaterialVOModel>> {

    private MaterialFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.material.find";
    }

    @Override
    public MaterialFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MaterialFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MaterialVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MaterialVOModel>>>() {};
    }

}
