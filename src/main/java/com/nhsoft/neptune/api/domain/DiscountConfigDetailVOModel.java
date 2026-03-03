package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountConfigDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountConfigDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="discount_id", example="11949")
    private Integer discountId;
    @ApiCloudField(value="discount_name", example="面值券2")
    private String discountName;
    @ApiCloudField(value="validity_type", example="1")
    private Integer validityType;
    @ApiCloudField(value="validity_day_num", example="4")
    private Integer validityDayNum;
    @ApiCloudField(value="begin_time", example="2026-01-01 00:00:00")
    private String beginTime;
    @ApiCloudField(value="end_time", example="2026-01-01 00:00:00")
    private String endTime;
    @ApiCloudField(value="after_day_num", example="4")
    private Integer afterDayNum;
    @ApiCloudField(value="coupon_action_detail_id", example="HYTQFQ9965800000002_11949")
    private String couponActionDetailId;
    @ApiCloudField(value="activity_detail_id", example="69821")
    private Long activityDetailId;
}
