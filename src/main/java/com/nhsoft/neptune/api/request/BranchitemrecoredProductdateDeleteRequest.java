package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchItemRecordProductDeleteDTOModel;

import java.util.*;

/**
 * delete_7请求类
 * 删除单据商品的生产日期
 */
public class BranchitemrecoredProductdateDeleteRequest implements ApiCloudRequest<BranchItemRecordProductDeleteDTOModel, Void> {

    private BranchItemRecordProductDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branchitemrecored.productdate.delete";
    }

    @Override
    public BranchItemRecordProductDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchItemRecordProductDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
