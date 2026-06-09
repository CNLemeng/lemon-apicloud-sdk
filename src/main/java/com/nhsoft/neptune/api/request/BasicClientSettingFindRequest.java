package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesalerExtendPropertyFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WholesalerExtendPropertyVOModel;

import com.nhsoft.neptune.api.domain.WholesalerExtendPropertyVOModel;

import java.util.*;

/**
 * findClientPropertySetting请求类
 * 客户拓展属性配置查询
 */
public class BasicClientSettingFindRequest implements ApiCloudRequest<WholesalerExtendPropertyFindDTOModel, List<WholesalerExtendPropertyVOModel>> {

    private WholesalerExtendPropertyFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.client.setting.find";
    }

    @Override
    public WholesalerExtendPropertyFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesalerExtendPropertyFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WholesalerExtendPropertyVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WholesalerExtendPropertyVOModel>>>() {};
    }

}
