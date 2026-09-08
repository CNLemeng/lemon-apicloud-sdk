package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OtherInoutShareOrderFindDTO模型
 * 费用分摊单查询参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OtherInoutShareOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="date_type", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="date_from", example="2026-08-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-08-31 23:59:59", required=true)
    private String dateTo;
    @ApiCloudField(value="branch_nums", example="[99]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="支持按费用分摊单号模糊查询", example="OS992608270001")
    private String fid;
    @ApiCloudField(value="item_nums", example="[5127]")
    private List<Integer> itemNums;
    @ApiCloudField(value="supplier_nums", example="[1001]")
    private List<Integer> supplierNums;
    @ApiCloudField(value="查询页码", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(分页大小最大为200)", required=true)
    private Integer pageSize;
}
