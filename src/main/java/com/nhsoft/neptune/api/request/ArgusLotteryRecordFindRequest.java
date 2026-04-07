package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.LotteryRecordFindDTOModel;
import com.nhsoft.neptune.api.domain.LotteryRecordVOModel;

import java.util.List;

/**
 * find_23请求类
 * 会员抽奖记录查询
 */
public class ArgusLotteryRecordFindRequest implements ApiCloudRequest<LotteryRecordFindDTOModel, List<LotteryRecordVOModel>> {

    private LotteryRecordFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.argus.lottery,record.find";
    }

    @Override
    public LotteryRecordFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(LotteryRecordFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<LotteryRecordVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<LotteryRecordVOModel>>>() {
        };
    }

}
