package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StockCarryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.StockCarryVOModel;

import com.nhsoft.neptune.api.domain.StockCarryVOModel;

import java.util.*;

/**
 * readStockCarry请求类
 * 成本结转读取
 */
public class InventoryStockcarryReadRequest implements ApiCloudRequest<StockCarryFindDTOModel, List<StockCarryVOModel>> {

    private StockCarryFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.stockcarry.read";
    }

    @Override
    public StockCarryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StockCarryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<StockCarryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<StockCarryVOModel>>>() {};
    }

}
