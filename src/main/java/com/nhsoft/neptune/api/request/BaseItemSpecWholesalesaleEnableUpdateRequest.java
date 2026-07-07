package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleSaleEnableDTOModel;

import java.util.*;

/**
 * updateWholesaleEnable请求类
 * 修改批发规格在线订货参数
 */
public class BaseItemSpecWholesalesaleEnableUpdateRequest implements ApiCloudRequest<WholesaleSaleEnableDTOModel, Object> {

    private WholesaleSaleEnableDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.spec.wholesalesale.enable.update";
    }

    @Override
    public WholesaleSaleEnableDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleSaleEnableDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}
