package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * EInvoiceFindBySettlementOrderDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EInvoiceFindBySettlementOrderDTOModel extends ApiCloudObject {

    @ApiCloudField(value="settlement_order_no", example="SSS99658990011898", required=true)
    private String settlementOrderNo;
}
