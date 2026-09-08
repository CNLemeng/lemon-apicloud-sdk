package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InOrderOutBillNoFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InOrderOutBillNoFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="in_order_out_bill_no", example="A0005", required=true)
    private String inOrderOutBillNo;
}
