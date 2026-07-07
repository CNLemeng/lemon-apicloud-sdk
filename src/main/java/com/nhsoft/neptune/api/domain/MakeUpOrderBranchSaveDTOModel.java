package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderBranchSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderBranchSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="make_up_type", example="配送扣补", required=true)
    private String makeUpType;
    @ApiCloudField(value="branch_num", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="settlement_branch_num", example="99", required=true)
    private Integer settlementBranchNum;
    @ApiCloudField(value="storehouse_num", example="996580001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="make_up_date_from", example="2026-06-16 00:00:00", required=true)
    private String makeUpDateFrom;
    @ApiCloudField(value="make_up_date_to", example="2026-06-16 23:59:59", required=true)
    private String makeUpDateTo;
    @ApiCloudField(value="make_up_creator", example="admin", required=true)
    private String makeUpCreator;
    @ApiCloudField(value="payment_date", example="2026-06-16 23:59:59", required=true)
    private String paymentDate;
    @ApiCloudField(value="make_up_memo", example="测试")
    private String makeUpMemo;
    @ApiCloudField(value="make_up_out_fid")
    private String makeUpOutFid;
    @ApiCloudField(value="branch_make_up_order_details", required=true)
    private List<MakeUpOrderBranchDetailSaveDTOModel> branchMakeUpOrderDetails;
}
