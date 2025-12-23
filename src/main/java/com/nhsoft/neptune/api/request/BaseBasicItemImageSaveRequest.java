package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BaseItemImageSaveDTOModel;

import java.util.*;

/**
 * saveItem_1请求类
 * 商品档案图片上传
 */
public class BaseBasicItemImageSaveRequest implements ApiCloudRequest<BaseItemImageSaveDTOModel, Void> {

    private BaseItemImageSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.basic.item.image.save";
    }

    @Override
    public BaseItemImageSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BaseItemImageSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
