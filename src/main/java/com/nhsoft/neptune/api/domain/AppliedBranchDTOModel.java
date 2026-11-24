package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AppliedBranchDTO模型
 * except_flag 为 true 表示该门店为例外门店
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AppliedBranchDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num")
    private Integer branchNum;
    @ApiCloudField(value="except_flag")
    private Boolean exceptFlag;
    @ApiCloudField(value="branch_lite")
    private BranchSimpleDTOModel branchLite;
}
