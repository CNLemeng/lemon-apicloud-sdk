package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageLadderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageLadderVOModel extends ApiCloudObject {

    @ApiCloudField(value="level")
    private Integer level;
    @ApiCloudField(value="policy_package_choose_amount")
    private BigDecimal policyPackageChooseAmount;
    @ApiCloudField(value="policy_package_payment_money")
    private BigDecimal policyPackagePaymentMoney;
}
