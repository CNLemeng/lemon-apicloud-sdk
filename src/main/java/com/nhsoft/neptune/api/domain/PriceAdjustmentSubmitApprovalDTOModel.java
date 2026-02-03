package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceAdjustmentSubmitApprovalDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceAdjustmentSubmitApprovalDTOModel extends ApiCloudObject {

    @ApiCloudField(value="price_adjustment_fid", example="TJ99658010000127", required=true)
    private String priceAdjustmentFid;
    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="departments", example="[食品部门]")
    private List<String> departments;
    @ApiCloudField(value="price_adjustment_check_policy", example="true")
    private Boolean priceAdjustmentCheckPolicy;
    @ApiCloudField(value="company_user_id", example="524574", required=true)
    private Long companyUserId;
}
