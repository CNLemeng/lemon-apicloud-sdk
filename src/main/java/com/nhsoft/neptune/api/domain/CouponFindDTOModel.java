package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="ids", example="[1]")
    private List<Long> ids;
    @ApiCloudField(value="barcodes", example="[87000996582654406900]")
    private List<String> barcodes;
    @ApiCloudField(value="states")
    private List<String> states;
    @ApiCloudField(value="phones", example="[18000152000]")
    private List<String> phones;
    @ApiCloudField(value="查询时间类型(创建时间|更新时间|核销时间|有效时间|作废时间)")
    private String dateType;
    @ApiCloudField(value="date_from", example="2026-01-01 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-01-01 00:00:00")
    private String dateTo;
    @ApiCloudField(value="activity_id", example="0")
    private Long activityId;
    @ApiCloudField(value="activity_ids")
    private List<Long> activityIds;
    @ApiCloudField(value="activity_detail_id", example="0")
    private Long activityDetailId;
    @ApiCloudField(value="activity_type")
    private String activityType;
    @ApiCloudField(value="activity_types")
    private List<String> activityTypes;
    @ApiCloudField(value="create_order_no")
    private String createOrderNo;
    @ApiCloudField(value="out_activity_ids")
    private List<String> outActivityIds;
    @ApiCloudField(value="query_detail")
    private Boolean queryDetail;
    @ApiCloudField(value="query_branch_ids")
    private Boolean queryBranchIds;
    @ApiCloudField(value="all_unusable")
    private Boolean allUnusable;
    @ApiCloudField(value="query_type_group")
    private Boolean queryTypeGroup;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大200）", example="10", required=true)
    private Integer pageSize;
}
