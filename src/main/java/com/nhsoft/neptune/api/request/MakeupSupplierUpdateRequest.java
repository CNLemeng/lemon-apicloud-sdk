package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MakeUpOrderSupplierUpdateDTOModel;

import com.nhsoft.neptune.api.domain.MakeUpOrderSupplierResponseDTOModel;

import java.util.*;

/**
 * updateSupplierMakeUpOrder请求类
 * 供应商扣补单修改
 */
public class MakeupSupplierUpdateRequest implements ApiCloudRequest<MakeUpOrderSupplierUpdateDTOModel, MakeUpOrderSupplierResponseDTOModel> {

    private MakeUpOrderSupplierUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.makeup.supplier.update";
    }

    @Override
    public MakeUpOrderSupplierUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MakeUpOrderSupplierUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MakeUpOrderSupplierResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MakeUpOrderSupplierResponseDTOModel>>() {};
    }

}
