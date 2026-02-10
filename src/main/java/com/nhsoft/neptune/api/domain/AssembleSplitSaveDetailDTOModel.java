package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AssembleSplitSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AssembleSplitSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="常用单位")
    private String assembleSplitDetailUseUnit;
    @ApiCloudField(value="常用数量")
    private BigDecimal assembleSplitDetailUseQty;
    @ApiCloudField(value="商品单位")
    private String assembleSplitDetailItemUnit;
    @ApiCloudField(value="商品数量")
    private BigDecimal assembleSplitDetailItemQty;
    @ApiCloudField(value="常用单价")
    private BigDecimal assembleSplitDetailUsePrice;
    @ApiCloudField(value="辅助数量")
    private BigDecimal assembleSplitDetailItemAssistQty;
    @ApiCloudField(value="辅助单位")
    private String assembleSplitDetailItemAssistUnit;
    @ApiCloudField(value="备注")
    private String assembleSplitDetailMemo;
    @ApiCloudField(value="生产日期")
    private String assembleSplitDetailProducingDate;
    @ApiCloudField(value="批次号")
    private String assembleSplitDetailLotNumber;
}
