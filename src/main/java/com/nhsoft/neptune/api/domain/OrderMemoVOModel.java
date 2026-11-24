package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderMemoVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderMemoVOModel extends ApiCloudObject {

    @ApiCloudField(value="order_memo_id")
    private String orderMemoId;
    @ApiCloudField(value="branch_num", example="99")
    private Integer branchNum;
    @ApiCloudField(value="order_memo_operator", example="admin")
    private String orderMemoOperator;
    @ApiCloudField(value="order_memo_time", example="2026-01-01 00:00:00")
    private String orderMemoTime;
    @ApiCloudField(value="order_memo_context")
    private String orderMemoContext;
    @ApiCloudField(value="order_memo_bill_no", example="YH99658092610270003")
    private String orderMemoBillNo;
}
