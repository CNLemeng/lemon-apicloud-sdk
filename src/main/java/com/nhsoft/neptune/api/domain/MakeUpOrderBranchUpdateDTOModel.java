package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderBranchUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderBranchUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_make_up_order_fid", example="BM9965800991000052", required=true)
    private String branchMakeUpOrderFid;
    @ApiCloudField(value="make_up_type", example="配送扣补")
    private String makeUpType;
    @ApiCloudField(value="settlement_branch_num", example="99")
    private Integer settlementBranchNum;
    @ApiCloudField(value="storehouse_num", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="make_up_date_from", example="2026-06-16 00:00:00")
    private String makeUpDateFrom;
    @ApiCloudField(value="make_up_date_to", example="2026-06-16 23:59:59")
    private String makeUpDateTo;
    @ApiCloudField(value="payment_date", example="2026-06-16 23:59:59")
    private String paymentDate;
    @ApiCloudField(value="make_up_memo", example="测试")
    private String makeUpMemo;
    @ApiCloudField(value="make_up_out_fid")
    private String makeUpOutFid;
    @ApiCloudField(value="operator", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="branch_make_up_order_details", required=true)
    private List<MakeUpOrderBranchDetailSaveDTOModel> branchMakeUpOrderDetails;
}
