package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MixOmsFailedOrderDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MixOmsFailedOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="food_group")
    private String foodGroup;
    @ApiCloudField(value="full_title")
    private String fullTitle;
    @ApiCloudField(value="id")
    private Integer id;
    @ApiCloudField(value="nhsoft_item_id")
    private String nhsoftItemId;
    @ApiCloudField(value="num")
    private Integer num;
    @ApiCloudField(value="order")
    private Integer order;
    @ApiCloudField(value="platform_item_id")
    private String platformItemId;
    @ApiCloudField(value="platform_spec_id")
    private String platformSpecId;
    @ApiCloudField(value="price")
    private Integer price;
    @ApiCloudField(value="spec_name")
    private String specName;
    @ApiCloudField(value="title")
    private String title;
    @ApiCloudField(value="total_ama_num")
    private Integer totalAmaNum;
    @ApiCloudField(value="total_fee")
    private Integer totalFee;
    @ApiCloudField(value="upc")
    private String upc;
}
