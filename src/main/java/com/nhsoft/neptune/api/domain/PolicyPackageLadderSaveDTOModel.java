package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageLadderSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageLadderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="policy_package_payment_money", required=true)
    private BigDecimal policyPackagePaymentMoney;
    @ApiCloudField(value="policy_package_choose_amount", required=true)
    private BigDecimal policyPackageChooseAmount;
}
