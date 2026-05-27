package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CallCenterOrderDetail模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CallCenterOrderDetailModel extends ApiCloudObject {

    @ApiCloudField(value="quantity")
    private BigDecimal quantity;
    @ApiCloudField(value="order_detail_id", required=true)
    private String orderDetailId;
    @ApiCloudField(value="item_num", required=true)
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
    @ApiCloudField(value="spec_num")
    private Long specNum;
}
