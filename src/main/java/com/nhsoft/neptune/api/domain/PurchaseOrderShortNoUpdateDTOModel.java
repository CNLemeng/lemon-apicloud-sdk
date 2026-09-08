package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseOrderShortNoUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseOrderShortNoUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="purchase_order_fid", example="PO2030990000001", required=true)
    private String purchaseOrderFid;
    @ApiCloudField(value="short_order_no", required=true)
    private String shortOrderNo;
}
