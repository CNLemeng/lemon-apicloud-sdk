package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderSupplierUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderSupplierUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="make_up_type", example="按照收货数量扣补", required=true)
    private String makeUpType;
    @ApiCloudField(value="supplier_num", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="storehouse_num", example="9967500001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="operator", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="payment_date", required=true)
    private String paymentDate;
    @ApiCloudField(value="make_up_out_fid", example="9967501000212")
    private String makeUpOutFid;
    @ApiCloudField(value="make_up_order_memo")
    private String makeUpOrderMemo;
    @ApiCloudField(value="make_up_order_details", required=true)
    private List<MakeUpOrderSupplierSaveDetailDTOModel> makeUpOrderDetails;
    @ApiCloudField(value="make_up_order_fid", example="9967501000212", required=true)
    private String makeUpOrderFid;
}
