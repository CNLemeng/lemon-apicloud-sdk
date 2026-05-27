package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTemplateBranchItemBatchDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTemplateBranchItemBatchDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品明细编号列表", example="", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="门店要货模板编号", example="434401000085", required=true)
    private Long templateNum;
}
