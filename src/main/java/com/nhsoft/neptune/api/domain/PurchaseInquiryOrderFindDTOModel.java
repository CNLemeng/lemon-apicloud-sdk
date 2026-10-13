package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseInquiryOrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseInquiryOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="date_type", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="date_from", example="2026-09-22 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-09-22 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="state_name", example="未审核")
    private String stateName;
    @ApiCloudField(value="supplier_nums", example="[9967500001]")
    private List<Integer> supplierNums;
    @ApiCloudField(value="item_nums", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大200)", example="100", required=true)
    private Integer pageSize;
}
