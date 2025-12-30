package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingPlanSaveDetailDTO模型
 * 生产计划单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingPlanSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="49", required=true)
    private Integer itemNum;
    @ApiCloudField(value="计划数量", example="1.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="库存单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="商品备注", example="备注信息")
    private String itemMemo;
}
