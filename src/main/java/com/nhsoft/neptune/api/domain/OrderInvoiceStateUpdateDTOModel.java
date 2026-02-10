package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderInvoiceStateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderInvoiceStateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="fid", example="PI99675000001", required=true)
    private String fid;
    @ApiCloudField(value="state", required=true)
    private String state;
    @ApiCloudField(value="invoice_no", required=true)
    private String invoiceNo;
    @ApiCloudField(value="qr_code_url")
    private String qrCodeUrl;
}
