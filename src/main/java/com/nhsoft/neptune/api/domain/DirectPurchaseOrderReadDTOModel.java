package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商直送单", example="PO2030990000001", required=true)
    private String purchaseOrderFid;
}
