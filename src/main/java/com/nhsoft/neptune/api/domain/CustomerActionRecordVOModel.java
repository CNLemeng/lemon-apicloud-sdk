package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerActionRecordVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerActionRecordVOModel extends ApiCloudObject {

    @ApiCloudField(value="customer_name", example="会员001")
    private String customerName;
    @ApiCloudField(value="customer_phone", example="17655200007")
    private String customerPhone;
    @ApiCloudField(value="channel", example="OFFLINE")
    private String channel;
    @ApiCloudField(value="created_at", example="2026-07-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="branch_id", example="996750001")
    private Long branchId;
    @ApiCloudField(value="branch_name", example="门店一")
    private String branchName;
    @ApiCloudField(value="record_status", example="UNISSUED")
    private String recordStatus;
    @ApiCloudField(value="ref_bill_no", example="99675012621113860005")
    private String refBillNo;
    @ApiCloudField(value="present_money", example="20.0")
    private BigDecimal presentMoney;
    @ApiCloudField(value="lottery_times", example="10")
    private Integer lotteryTimes;
    @ApiCloudField(value="coupon_send_ids", example="[\"6435391\"}]")
    private List<String> couponSendIds;
}
