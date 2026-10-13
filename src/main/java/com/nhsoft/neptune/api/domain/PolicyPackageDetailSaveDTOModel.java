package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPackageDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPackageDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="item_num", example="4564", required=true)
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num", example="10001201")
    private Integer itemGradeNum;
    @ApiCloudField(value="policy_package_detail_memo", example="商品备注")
    private String policyPackageDetailMemo;
}
