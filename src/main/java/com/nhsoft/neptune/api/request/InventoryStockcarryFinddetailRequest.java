package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StockCarryDetailFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.StockCarryDetailVOModel;

import com.nhsoft.neptune.api.domain.StockCarryDetailVOModel;

import java.util.*;

/**
 * readStockCarry请求类
 * 成本结转明细查询
 */
public class InventoryStockcarryFinddetailRequest implements ApiCloudRequest<StockCarryDetailFindDTOModel, List<StockCarryDetailVOModel>> {

    private StockCarryDetailFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.stockcarry.finddetail";
    }

    @Override
    public StockCarryDetailFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StockCarryDetailFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<StockCarryDetailVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<StockCarryDetailVOModel>>>() {};
    }

}
