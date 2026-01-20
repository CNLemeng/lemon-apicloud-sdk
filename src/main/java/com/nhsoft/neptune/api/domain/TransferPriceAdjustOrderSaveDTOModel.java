package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferPriceAdjustOrderSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferPriceAdjustOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应用门店编号列表", example="1", required=true)
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="生效日期(yyyy-MM-dd)", example="2022-01-01", required=true)
    private String priceAdjustmentEffectiveDate;
    @ApiCloudField(value="失效日期(yyyy-MM-dd)", example="2022-01-30")
    private String priceAdjustmentInvalidDate;
    @ApiCloudField(value="price_adjustment_time_from")
    private String priceAdjustmentTimeFrom;
    @ApiCloudField(value="price_adjustment_time_to")
    private String priceAdjustmentTimeTo;
    @ApiCloudField(value="失效后价格（按调整前价格|按当前商品档案价格|随商品档案价格变动）", example="按调整前价格")
    private String priceAdjustmentReturnType;
    @ApiCloudField(value="备注", example="")
    private String priceAdjustmentMemo;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String priceAdjustmentOperator;
    @ApiCloudField(value="明细", example="", required=true)
    private List<TransferPriceAdjustOrderDetailSaveDTOModel> details;
}
