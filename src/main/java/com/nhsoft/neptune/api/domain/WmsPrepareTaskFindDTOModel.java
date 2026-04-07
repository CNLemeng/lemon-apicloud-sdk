package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsPrepareTaskFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsPrepareTaskFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="wms_bizday", example="20260401", required=true)
    private String wmsBizday;
    @ApiCloudField(value="item_nums", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="customer_nums", example="[1]")
    private List<Long> customerNums;
    @ApiCloudField(value="supplier_num", example="996580001")
    private Integer supplierNum;
    @ApiCloudField(value="creators", example="[admin]")
    private List<String> creators;
    @ApiCloudField(value="completers")
    private List<String> completers;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="10", required=true)
    private Integer pageSize;
}
