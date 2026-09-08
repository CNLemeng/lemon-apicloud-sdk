package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixBranchTransferVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixBranchTransferVOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="1")
    private Integer itemNum;
    @ApiCloudField(value="branch_num", example="1")
    private Integer branchNum;
    @ApiCloudField(value="store_matrix_cost_price")
    private BigDecimal storeMatrixCostPrice;
    @ApiCloudField(value="store_matrix_transfer_price")
    private BigDecimal storeMatrixTransferPrice;
    @ApiCloudField(value="store_matrix_sleep_flag")
    private Integer storeMatrixSleepFlag;
    @ApiCloudField(value="store_matrix_transfer_fixed_gross")
    private Boolean storeMatrixTransferFixedGross;
    @ApiCloudField(value="store_matrix_transfer_gross")
    private BigDecimal storeMatrixTransferGross;
    @ApiCloudField(value="store_matrix_last_edit_time")
    private String storeMatrixLastEditTime;
    @ApiCloudField(value="store_matrix_last_editor")
    private String storeMatrixLastEditor;
    @ApiCloudField(value="store_matrix_purchase_price")
    private BigDecimal storeMatrixPurchasePrice;
}
