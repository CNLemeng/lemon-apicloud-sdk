package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberLevelPriceAdjustmentSaveDTOModel;

import com.nhsoft.neptune.api.domain.MemberLevelPriceAdjustmentVOModel;

import java.util.*;

/**
 * save_7请求类
 * 会员等级价调整新增并审核
 */
public class BaseMemberLevelAdjustmentSaveandauditRequest implements ApiCloudRequest<MemberLevelPriceAdjustmentSaveDTOModel, MemberLevelPriceAdjustmentVOModel> {

    private MemberLevelPriceAdjustmentSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.member.level.adjustment.saveandaudit";
    }

    @Override
    public MemberLevelPriceAdjustmentSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberLevelPriceAdjustmentSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberLevelPriceAdjustmentVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberLevelPriceAdjustmentVOModel>>() {};
    }

}
