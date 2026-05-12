package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="in_branch_num", example="99", required=true)
    private Integer inBranchNum;
    @ApiCloudField(value="in_storehouse_num", example="996750000001", required=true)
    private Integer inStorehouseNum;
    @ApiCloudField(value="out_branch_num", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="out_storehouse_num", required=true)
    private Integer outStorehouseNum;
    @ApiCloudField(value="supplier_num")
    private Integer supplierNum;
    @ApiCloudField(value="order_type")
    private String orderType;
    @ApiCloudField(value="order_no")
    private String orderNo;
    @ApiCloudField(value="editor")
    private String editor;
}
