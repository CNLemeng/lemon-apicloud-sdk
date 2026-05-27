package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveOrderOutBillNoSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveOrderOutBillNoSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="receive_order_fid", example="PI9967599000001", required=true)
    private String receiveOrderFid;
    @ApiCloudField(value="receive_order_out_bill_no", example="AR70000001", required=true)
    private String receiveOrderOutBillNo;
}
