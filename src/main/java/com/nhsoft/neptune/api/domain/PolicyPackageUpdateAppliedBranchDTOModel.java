package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageUpdateAppliedBranchDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageUpdateAppliedBranchDTOModel extends ApiCloudObject {

    @ApiCloudField(value="policy_package_no", required=true)
    private String policyPackageNo;
    @ApiCloudField(value="policy_package_applied_branch", required=true)
    private List<Integer> policyPackageAppliedBranch;
    @ApiCloudField(value="except_branch")
    private Boolean exceptBranch;
    @ApiCloudField(value="broadcast")
    private Boolean broadcast;
    @ApiCloudField(value="operator", required=true)
    private String operator;
}
