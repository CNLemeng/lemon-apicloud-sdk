package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AdjustmentOrderFindByOutBilNoDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdjustmentOrderFindByOutBilNoDTOModel extends ApiCloudObject {

    @ApiCloudField(value="adjustment_order_out_bill_no", required=true)
    private String adjustmentOrderOutBillNo;
}
