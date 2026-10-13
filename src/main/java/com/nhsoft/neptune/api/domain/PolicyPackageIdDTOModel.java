package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="policy_package_no")
    private String policyPackageNo;
}
