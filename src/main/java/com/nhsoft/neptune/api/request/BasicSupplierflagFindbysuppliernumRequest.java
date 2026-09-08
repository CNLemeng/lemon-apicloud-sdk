package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierNumBatchDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierSupplierFlagVOModel;

import com.nhsoft.neptune.api.domain.SupplierSupplierFlagVOModel;

import java.util.*;

/**
 * findSupplierByFlag请求类
 * 根据供应商查询关联的标签
 */
public class BasicSupplierflagFindbysuppliernumRequest implements ApiCloudRequest<SupplierNumBatchDTOModel, List<SupplierSupplierFlagVOModel>> {

    private SupplierNumBatchDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.supplierflag.findbysuppliernum";
    }

    @Override
    public SupplierNumBatchDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierNumBatchDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierSupplierFlagVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierSupplierFlagVOModel>>>() {};
    }

}
