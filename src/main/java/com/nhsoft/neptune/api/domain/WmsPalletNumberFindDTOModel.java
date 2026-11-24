package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsPalletNumberFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsPalletNumberFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="pallet_numbers", example="RQ996582609170006", required=true)
    private List<String> palletNumbers;
    @ApiCloudField(value="erp_order_fid")
    private String erpOrderFid;
}
