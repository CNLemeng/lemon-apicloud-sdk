package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerActionRecordFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerActionRecordFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="customer_action_id", required=true)
    private Long customerActionId;
    @ApiCloudField(value="date_from", example="2026-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="date_to", example="2026-12-01 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="keyword")
    private String keyword;
    @ApiCloudField(value="channel", example="OFFLINE")
    private String channel;
    @ApiCloudField(value="record_status", example="UNISSUED")
    private String recordStatus;
    @ApiCloudField(value="ref_bill_no", example="207299260190001")
    private String refBillNo;
    @ApiCloudField(value="branch_ids")
    private List<Integer> branchIds;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="300", required=true)
    private Integer pageSize;
}
