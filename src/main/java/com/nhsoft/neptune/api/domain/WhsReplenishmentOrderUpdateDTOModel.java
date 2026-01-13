package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsReplenishmentOrderUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsReplenishmentOrderUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="客户编号", example="99", required=true)
    private String clientFid;
    @ApiCloudField(value="业务日期", example="2023-01-01 00:00:00", required=true)
    private String businessDate;
    @ApiCloudField(value="付款日期", example="2023-01-01 00:00:00")
    private String paymentDate;
    @ApiCloudField(value="销售员", example="admin")
    private String seller;
    @ApiCloudField(value="备注", example="测试")
    private String memo;
    @ApiCloudField(value="批发销售单号", example="WO1099990000239")
    private String wholesaleOrderFid;
    @ApiCloudField(value="明细列表", required=true)
    private List<WhsReplenishmentOrderSaveDetailDTOModel> detailList;
    @ApiCloudField(value="批发货补单编号", example="RSO0010990000000006")
    private String replenishmentOrderId;
}
