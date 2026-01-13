package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsReplenishmentOrderFullyVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsReplenishmentOrderFullyVOModel extends ApiCloudObject {

    @ApiCloudField(value="批发货补单编号", example="RSO0010990000000006")
    private String replenishmentOrderId;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="客户编号", example="001099990000001")
    private String clientFid;
    @ApiCloudField(value="业务日期", example="2023-01-01 00:00:00")
    private String businessDate;
    @ApiCloudField(value="付款日期", example="2023-01-01 00:00:00")
    private String paymentDate;
    @ApiCloudField(value="备注", example="测试")
    private String memo;
    @ApiCloudField(value="补货合计金额", example="100.0")
    private BigDecimal replenishmentMoney;
    @ApiCloudField(value="付款金额", example="0.0")
    private BigDecimal paidMoney;
    @ApiCloudField(value="折扣金额", example="0.0")
    private BigDecimal discountMoney;
    @ApiCloudField(value="税额", example="0.0")
    private BigDecimal taxMoney;
    @ApiCloudField(value="结算状态(UNSETTLED:未结算)", example="UNSETTLED")
    private String settleStatus;
    @ApiCloudField(value="状态码（1：制单，3：制单|审核）", example="1")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String stateName;
    @ApiCloudField(value="制单时间", example="2023-01-01 00:00:00")
    private String createTime;
    @ApiCloudField(value="审核时间", example="2023-01-01 00:00:00")
    private String auditTime;
    @ApiCloudField(value="制单人", example="admin")
    private String createUser;
    @ApiCloudField(value="审核人", example="admin")
    private String auditUser;
    @ApiCloudField(value="销售员", example="admin")
    private String seller;
    @ApiCloudField(value="批发销售单号", example="WO1099990000239")
    private String wholesaleOrderFid;
    @ApiCloudField(value="明细列表")
    private List<WhsReplenishmentOrderDetailVOModel> detailList;
}
