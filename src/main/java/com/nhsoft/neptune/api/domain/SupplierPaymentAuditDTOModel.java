package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPaymentAuditDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPaymentAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="payment_no", example="SP2072990000035", required=true)
    private String paymentNo;
}
