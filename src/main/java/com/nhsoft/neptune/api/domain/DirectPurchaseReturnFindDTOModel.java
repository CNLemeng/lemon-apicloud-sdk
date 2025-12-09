package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseReturnFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseReturnFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型(制单时间,审核时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期(yyyy-MM-dd HH:mm:ss)", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期(yyyy-MM-dd HH:mm:ss)", required=true)
    private String dateTo;
    @ApiCloudField(value="退货门店编号", example="[1,2,3]")
    private List<Integer> branchNums;
    @ApiCloudField(value="收货门店编号", example="[1,2,3]")
    private List<Integer> receiveBranchNums;
    @ApiCloudField(value="供应商编号", example="[996750030]")
    private List<Integer> supplierNums;
    @ApiCloudField(value="商品编号", example="[1,2,3]")
    private List<Integer> itemNums;
    @ApiCloudField(value="单据状态(1:制单;3:制单|审核;7:制单|审核|作废)", example="1")
    private Integer stateCode;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="200", required=true)
    private Integer pageSize;
}
