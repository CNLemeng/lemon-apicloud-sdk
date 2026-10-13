package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="policy_package_detail_num", example="1")
    private Integer policyPackageDetailNum;
    @ApiCloudField(value="item_num", example="4564")
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num", example="10001200")
    private Integer itemGradeNum;
    @ApiCloudField(value="spec_num")
    private Long specNum;
    @ApiCloudField(value="policy_package_detail_memo", example="A")
    private String policyPackageDetailMemo;
    @ApiCloudField(value="policy_package_detail_cancel", example="true")
    private Boolean policyPackageDetailCancel;
    @ApiCloudField(value="policy_package_detail_cancel_operator", example="admin")
    private String policyPackageDetailCancelOperator;
    @ApiCloudField(value="policy_package_detail_cancel_time", example="2021-01-01 00:00:00")
    private String policyPackageDetailCancelTime;
}
