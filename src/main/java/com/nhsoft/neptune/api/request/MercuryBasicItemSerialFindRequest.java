package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasicGroupProductSerialFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BasicGroupProductSerialVOModel;

import com.nhsoft.neptune.api.domain.BasicGroupProductSerialVOModel;

import java.util.*;

/**
 * findGroupProductSerial请求类
 * 商城商品分组商品排序查询
 */
public class MercuryBasicItemSerialFindRequest implements ApiCloudRequest<BasicGroupProductSerialFindDTOModel, List<BasicGroupProductSerialVOModel>> {

    private BasicGroupProductSerialFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.basic.item.serial.find";
    }

    @Override
    public BasicGroupProductSerialFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasicGroupProductSerialFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasicGroupProductSerialVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasicGroupProductSerialVOModel>>>() {};
    }

}
