package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryProductDetailFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryProductDetailFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="date_from", example="2026-01-01 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-01-02 00:00:00")
    private String dateTo;
    @ApiCloudField(value="item_nums")
    private List<Integer> itemNums;
    @ApiCloudField(value="page")
    private Boolean page;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="10", required=true)
    private Integer pageSize;
}
