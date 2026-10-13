package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageUpdatePromotionDateToDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageUpdatePromotionDateToDTOModel extends ApiCloudObject {

    @ApiCloudField(value="policy_package_no", required=true)
    private String policyPackageNo;
    @ApiCloudField(value="policy_package_date_to", required=true)
    private String policyPackageDateTo;
    @ApiCloudField(value="operator", required=true)
    private String operator;
}
