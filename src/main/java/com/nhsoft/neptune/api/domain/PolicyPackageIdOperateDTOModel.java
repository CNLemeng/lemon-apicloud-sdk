package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageIdOperateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageIdOperateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="policy_package_no")
    private String policyPackageNo;
    @ApiCloudField(value="operator", required=true)
    private String operator;
}
