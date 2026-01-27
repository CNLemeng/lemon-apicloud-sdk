package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberLevelPriceAdjustmentSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberLevelPriceAdjustmentSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户中心门店编号", example="93766", required=true)
    private Long branchId;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="调整渠道(1:线下|2:线上|3:线下+线上)", example="1", required=true)
    private Integer memberLevelPriceAdjustChannel;
    @ApiCloudField(value="应用用户中心门店编号", example="[93767]", required=true)
    private List<Long> appliedBranchIds;
    @ApiCloudField(value="备注", example="测试")
    private String memberLevelPriceAdjustmentMemo;
    @ApiCloudField(value="调整明细", required=true)
    private List<MemberLevelPriceAdjustmentDetailSaveDTOModel> adjustmentDetails;
}
