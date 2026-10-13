package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseInquiryOrderIdOperateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseInquiryOrderIdOperateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="purchase_inquiry_order_fid", example="PIO99675992609220001", required=true)
    private String purchaseInquiryOrderFid;
    @ApiCloudField(value="operator", example="admin", required=true)
    private String operator;
}
