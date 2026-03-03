package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierFlagFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierFlagVOModel;

import com.nhsoft.neptune.api.domain.SupplierFlagVOModel;

import java.util.*;

/**
 * findSupplierFlag请求类
 * 查询供应商标签
 */
public class BasicSupplierflagFindRequest implements ApiCloudRequest<SupplierFlagFindDTOModel, List<SupplierFlagVOModel>> {

    private SupplierFlagFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.supplierflag.find";
    }

    @Override
    public SupplierFlagFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierFlagFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierFlagVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierFlagVOModel>>>() {};
    }

}
