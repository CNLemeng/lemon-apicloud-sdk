package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderBranchResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderBranchResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="BM9999100991001003")
    private String branchMakeUpOrderFid;
    @ApiCloudField(value="结算门店编码", example="1")
    private Integer settlementBranchNum;
    @ApiCloudField(value="仓库编码", example="999910002")
    private Integer storehouseNum;
    @ApiCloudField(value="扣补类型", example="配送扣补")
    private String makeUpType;
    @ApiCloudField(value="扣补金额", example="200.0")
    private BigDecimal makeUpMoney;
    @ApiCloudField(value="已结算金额", example="0.0")
    private BigDecimal settlementMoney;
    @ApiCloudField(value="状态代码", example="1")
    private Integer makeUpStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String makeUpStateName;
    @ApiCloudField(value="开始日期", example="2022-07-17 12:00:00")
    private String makeUpDateFrom;
    @ApiCloudField(value="结束日期", example="2022-07-24 12:00:00")
    private String makeUpDateTo;
    @ApiCloudField(value="创建人", example="admin")
    private String makeUpCreator;
    @ApiCloudField(value="创建时间", example="admin")
    private String makeUpCreateTime;
    @ApiCloudField(value="审核人", example="admin")
    private String makeUpAuditor;
    @ApiCloudField(value="审核时间", example="2025-01-01 00:00:00")
    private String makeUpAuditTime;
    @ApiCloudField(value="最后修改时间", example="2025-01-01 00:00:00")
    private String makeUpLastEditTime;
    @ApiCloudField(value="最后结算时间", example="2025-01-01 00:00:00")
    private String makeUpLastPaymentDate;
    @ApiCloudField(value="关联单号", example="")
    private String makeUpOutFid;
    @ApiCloudField(value="明细", example="")
    private List<MakeUpOrderBranchDetailResponseDTOModel> branchMakeUpOrderDetails;
}
