package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsPalletNumberFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsPalletNumberVOModel;

import com.nhsoft.neptune.api.domain.WmsPalletNumberVOModel;

import java.util.*;

/**
 * findPalletNumber请求类
 * 托盘查询
 */
public class WmsPalletnumberFindRequest implements ApiCloudRequest<WmsPalletNumberFindDTOModel, List<WmsPalletNumberVOModel>> {

    private WmsPalletNumberFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.palletnumber.find";
    }

    @Override
    public WmsPalletNumberFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsPalletNumberFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsPalletNumberVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsPalletNumberVOModel>>>() {};
    }

}
