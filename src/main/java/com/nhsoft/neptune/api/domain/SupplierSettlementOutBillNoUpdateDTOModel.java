package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierSettlementOutBillNoUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierSettlementOutBillNoUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="supplier_settlement_no", example="CP4344990000237", required=true)
    private String supplierSettlementNo;
    @ApiCloudField(value="settlement_out_bill_no", required=true)
    private String settlementOutBillNo;
}
