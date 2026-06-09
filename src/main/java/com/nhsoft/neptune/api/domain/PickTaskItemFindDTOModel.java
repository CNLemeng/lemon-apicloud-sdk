package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PickTaskItemFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PickTaskItemFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="wms_bizday", required=true)
    private String wmsBizday;
    @ApiCloudField(value="item_nums", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="department_names")
    private List<String> departmentNames;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="100", required=true)
    private Integer pageSize;
}
