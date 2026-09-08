package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBranchBalanceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBranchBalanceVOModel extends ApiCloudObject {

    @ApiCloudField(value="balance", example="20.0")
    private BigDecimal balance;
    @ApiCloudField(value="frozen_balance", example="100.0")
    private BigDecimal frozenBalance;
}
