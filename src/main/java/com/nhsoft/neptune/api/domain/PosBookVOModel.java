package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosBookVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosBookVOModel extends ApiCloudObject {

    @ApiCloudField(value="book_id")
    private String bookId;
    @ApiCloudField(value="order_no")
    private String orderNo;
    @ApiCloudField(value="branch_num")
    private Integer branchNum;
    @ApiCloudField(value="shift_table_bizday")
    private String shiftTableBizday;
    @ApiCloudField(value="pick_type")
    private String pickType;
    @ApiCloudField(value="state")
    private String state;
    @ApiCloudField(value="buyer_name")
    private String buyerName;
    @ApiCloudField(value="buyer_phone")
    private String buyerPhone;
    @ApiCloudField(value="picker_name")
    private String pickerName;
    @ApiCloudField(value="picker_phone")
    private String pickerPhone;
    @ApiCloudField(value="pick_date")
    private String pickDate;
    @ApiCloudField(value="pick_address")
    private String pickAddress;
    @ApiCloudField(value="memo")
    private String memo;
    @ApiCloudField(value="created_at")
    private String createdAt;
    @ApiCloudField(value="created_by_name")
    private String createdByName;
    @ApiCloudField(value="shipped_at")
    private String shippedAt;
    @ApiCloudField(value="shipped_by_name")
    private String shippedByName;
    @ApiCloudField(value="request_order_fid")
    private String requestOrderFid;
    @ApiCloudField(value="pick_up_no")
    private String pickUpNo;
    @ApiCloudField(value="book_type")
    private String bookType;
    @ApiCloudField(value="order_total_money")
    private BigDecimal orderTotalMoney;
    @ApiCloudField(value="discount_total_money")
    private BigDecimal discountTotalMoney;
    @ApiCloudField(value="receive_total_money")
    private BigDecimal receiveTotalMoney;
}
