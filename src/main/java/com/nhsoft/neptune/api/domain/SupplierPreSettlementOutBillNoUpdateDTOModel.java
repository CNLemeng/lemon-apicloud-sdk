package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierPreSettlementOutBillNoUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierPreSettlementOutBillNoUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="pre_settlement_no", example="YF4344010000010", required=true)
    private String preSettlementNo;
    @ApiCloudField(value="pre_settlement_out_bill_no", required=true)
    private String preSettlementOutBillNo;
}
