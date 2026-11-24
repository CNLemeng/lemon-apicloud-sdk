package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageUpdateAppliedBranchDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageUpdateAppliedBranchDTOModel extends ApiCloudObject {

    @ApiCloudField(value="自选套餐编号", example="996750000013", required=true)
    private String customizePackageNo;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="应用门店/例外门店编码，空列表表示全部门店", example="[1,2]")
    private List<Integer> appliedBranchNums;
    @ApiCloudField(value="是否例外门店，须与原套餐一致，null 按 false 处理", example="false")
    private Boolean exceptBranch;
    @ApiCloudField(value="修改后是否广播", example="true")
    private Boolean broadcast;
}
