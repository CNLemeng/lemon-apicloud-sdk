package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierBatchReadDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierReadResponseV2DTOModel;

import com.nhsoft.neptune.api.domain.SupplierReadResponseV2DTOModel;

import java.util.*;

/**
 * findSupplierByNos请求类
 * 供应商批量读取
 */
public class BasicSupplierFindbyidsRequest implements ApiCloudRequest<SupplierBatchReadDTOModel, List<SupplierReadResponseV2DTOModel>> {

    private SupplierBatchReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.supplier.findbyids";
    }

    @Override
    public SupplierBatchReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierBatchReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierReadResponseV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierReadResponseV2DTOModel>>>() {};
    }

}
