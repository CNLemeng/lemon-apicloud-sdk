package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CallCenterOrderSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CallCenterOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_id", required=true)
    private String orderId;
    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="pick_type", example="SELF_PICK", required=true)
    private String pickType;
    @ApiCloudField(value="book_type", example="ADVANCE", required=true)
    private String bookType;
    @ApiCloudField(value="create_time", required=true)
    private String createTime;
    @ApiCloudField(value="pick_date", required=true)
    private String pickDate;
    @ApiCloudField(value="buyer_name")
    private String buyerName;
    @ApiCloudField(value="buyer_phone")
    private String buyerPhone;
    @ApiCloudField(value="picker_name")
    private String pickerName;
    @ApiCloudField(value="picker_phone")
    private String pickerPhone;
    @ApiCloudField(value="pick_address")
    private String pickAddress;
    @ApiCloudField(value="memo")
    private String memo;
    @ApiCloudField(value="order_detail", required=true)
    private List<CallCenterOrderDetailModel> orderDetail;
}
