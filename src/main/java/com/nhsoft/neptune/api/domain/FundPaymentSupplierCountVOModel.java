package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FundPaymentSupplierCountVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FundPaymentSupplierCountVOModel extends ApiCloudObject {

    @ApiCloudField(value="passed")
    private Boolean passed;
    @ApiCloudField(value="count")
    private Integer count;
    @ApiCloudField(value="msg")
    private String msg;
}
