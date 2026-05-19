package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierFindByFlagDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierReadResponseV2DTOModel;

import com.nhsoft.neptune.api.domain.SupplierReadResponseV2DTOModel;

import java.util.*;

/**
 * findSupplierByFlag请求类
 * 根据标签查询供应商
 */
public class BasicSupplierFindbyflagRequest implements ApiCloudRequest<SupplierFindByFlagDTOModel, List<SupplierReadResponseV2DTOModel>> {

    private SupplierFindByFlagDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.supplier.findbyflag";
    }

    @Override
    public SupplierFindByFlagDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierFindByFlagDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierReadResponseV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierReadResponseV2DTOModel>>>() {};
    }

}
