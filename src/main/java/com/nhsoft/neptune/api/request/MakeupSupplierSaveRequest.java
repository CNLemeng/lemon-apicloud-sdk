package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MakeUpOrderSupplierSaveDTOModel;

import com.nhsoft.neptune.api.domain.MakeUpOrderSupplierResponseDTOModel;

import java.util.*;

/**
 * saveSupplierMakeUpOrder请求类
 * 供应商扣补单新增
 */
public class MakeupSupplierSaveRequest implements ApiCloudRequest<MakeUpOrderSupplierSaveDTOModel, MakeUpOrderSupplierResponseDTOModel> {

    private MakeUpOrderSupplierSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.makeup.supplier.save";
    }

    @Override
    public MakeUpOrderSupplierSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MakeUpOrderSupplierSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MakeUpOrderSupplierResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MakeUpOrderSupplierResponseDTOModel>>() {};
    }

}
