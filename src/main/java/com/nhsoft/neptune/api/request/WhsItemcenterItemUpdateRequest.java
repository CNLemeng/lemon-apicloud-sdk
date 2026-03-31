package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsPosItemUpdateDTOModel;

import java.util.*;

/**
 * update_8请求类
 * 批发商品档案修改
 */
public class WhsItemcenterItemUpdateRequest implements ApiCloudRequest<WhsPosItemUpdateDTOModel, Void> {

    private WhsPosItemUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.itemcenter.item.update";
    }

    @Override
    public WhsPosItemUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsPosItemUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
