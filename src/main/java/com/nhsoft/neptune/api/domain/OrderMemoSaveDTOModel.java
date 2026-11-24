package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderMemoSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderMemoSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_memo_id")
    private String orderMemoId;
    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="order_memo_operator", required=true)
    private String orderMemoOperator;
    @ApiCloudField(value="order_memo_context", required=true)
    private String orderMemoContext;
    @ApiCloudField(value="order_memo_bill_no", required=true)
    private String orderMemoBillNo;
}
