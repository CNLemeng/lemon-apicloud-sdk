package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PlatformSchedulingFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PlatformSchedulingFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="date_type", example="入仓日期", required=true)
    private String dateType;
    @ApiCloudField(value="date_from", example="2026-06-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-06-30 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="enter_states", example="[未入场]")
    private List<String> enterStates;
    @ApiCloudField(value="supplier_nums", example="[9965800001]")
    private List<Integer> supplierNums;
    @ApiCloudField(value="dock_nums")
    private List<Integer> dockNums;
    @ApiCloudField(value="order_fid_type", example="预约单号")
    private String orderFidType;
    @ApiCloudField(value="order_fids", example="[YD9965899261630000001]")
    private List<String> orderFids;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="10", required=true)
    private Integer pageSize;
}
