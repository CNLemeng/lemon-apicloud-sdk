package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="item_traceability_detail_id")
    private String itemTraceabilityDetailId;
    @ApiCloudField(value="item_traceability_id")
    private String itemTraceabilityId;
    @ApiCloudField(value="item_traceability_code")
    private String itemTraceabilityCode;
    @ApiCloudField(value="in_branch_num")
    private Integer inBranchNum;
    @ApiCloudField(value="in_branch_name")
    private String inBranchName;
    @ApiCloudField(value="in_storehouse_num")
    private Integer inStorehouseNum;
    @ApiCloudField(value="in_storehouse_name")
    private String inStorehouseName;
    @ApiCloudField(value="out_branch_num")
    private Integer outBranchNum;
    @ApiCloudField(value="out_branch_name")
    private String outBranchName;
    @ApiCloudField(value="out_storehouse_num")
    private Integer outStorehouseNum;
    @ApiCloudField(value="out_storehouse_name")
    private String outStorehouseName;
    @ApiCloudField(value="supplier_num")
    private Integer supplierNum;
    @ApiCloudField(value="supplier_name")
    private String supplierName;
    @ApiCloudField(value="order_type")
    private String orderType;
    @ApiCloudField(value="order_no")
    private String orderNo;
    @ApiCloudField(value="editor")
    private String editor;
    @ApiCloudField(value="edit_time")
    private String editTime;
}
