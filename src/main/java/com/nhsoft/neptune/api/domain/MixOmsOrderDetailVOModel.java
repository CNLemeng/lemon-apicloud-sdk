package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsOrderDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="ama_item_id")
    private String amaItemId;
    @ApiCloudField(value="id")
    private Integer id;
    @ApiCloudField(value="is_giveaway")
    private Boolean isGiveaway;
    @ApiCloudField(value="num")
    private Integer num;
    @ApiCloudField(value="payment")
    private BigDecimal payment;
    @ApiCloudField(value="price")
    private BigDecimal price;
    @ApiCloudField(value="refund_status")
    private Integer refundStatus;
    @ApiCloudField(value="refunded_num")
    private Integer refundedNum;
    @ApiCloudField(value="spec_name")
    private String specName;
    @ApiCloudField(value="title")
    private String title;
    @ApiCloudField(value="total_ama_num")
    private BigDecimal totalAmaNum;
    @ApiCloudField(value="total_fee")
    private BigDecimal totalFee;
}
