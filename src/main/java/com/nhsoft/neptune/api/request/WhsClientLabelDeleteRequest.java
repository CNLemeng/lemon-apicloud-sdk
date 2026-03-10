package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleClientLabelIdDTOModel;

import java.util.*;

/**
 * delete_3请求类
 * 批发客户标签删除
 */
public class WhsClientLabelDeleteRequest implements ApiCloudRequest<WholesaleClientLabelIdDTOModel, Void> {

    private WholesaleClientLabelIdDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.client.label.delete";
    }

    @Override
    public WholesaleClientLabelIdDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleClientLabelIdDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
