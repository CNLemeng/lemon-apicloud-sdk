package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseOrderShortNoVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderShortNoVOModel extends ApiCloudObject {

    @ApiCloudField(value="purchase_order_fid", example="PO2030990000001")
    private String purchaseOrderFid;
    @ApiCloudField(value="short_order_no")
    private String shortOrderNo;
}
