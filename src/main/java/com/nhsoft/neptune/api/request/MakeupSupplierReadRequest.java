package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MakeUpOrderSupplierReadDTOModel;

import com.nhsoft.neptune.api.domain.MakeUpOrderSupplierResponseDTOModel;

import java.util.*;

/**
 * readSupplierMakeUpOrder请求类
 * 供应商扣补单读取
 */
public class MakeupSupplierReadRequest implements ApiCloudRequest<MakeUpOrderSupplierReadDTOModel, MakeUpOrderSupplierResponseDTOModel> {

    private MakeUpOrderSupplierReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.makeup.supplier.read";
    }

    @Override
    public MakeUpOrderSupplierReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MakeUpOrderSupplierReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MakeUpOrderSupplierResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MakeUpOrderSupplierResponseDTOModel>>() {};
    }

}
