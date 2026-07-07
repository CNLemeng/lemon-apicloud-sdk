package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MercuryCouponTypeParamDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MercuryCouponTypeParamDTOModel extends ApiCloudObject {

    @ApiCloudField(value="pick_types")
    private List<String> pickTypes;
    @ApiCloudField(value="vip_incompatible")
    private Boolean vipIncompatible;
    @ApiCloudField(value="branch_ids")
    private List<Long> branchIds;
    @ApiCloudField(value="except_branch_ids")
    private List<Long> exceptBranchIds;
    @ApiCloudField(value="variant_ids")
    private List<Long> variantIds;
    @ApiCloudField(value="except_variant_ids")
    private List<Long> exceptVariantIds;
    @ApiCloudField(value="group_ids")
    private List<Long> groupIds;
    @ApiCloudField(value="except_group_ids")
    private List<Long> exceptGroupIds;
    @ApiCloudField(value="仅读取接口返回")
    private List<CouponVariantDTOModel> variants;
    @ApiCloudField(value="仅读取接口返回")
    private List<ProductGroupDTOModel> groups;
    @ApiCloudField(value="max_random_value")
    private BigDecimal maxRandomValue;
    @ApiCloudField(value="min_random_value")
    private BigDecimal minRandomValue;
    @ApiCloudField(value="allow_overlay")
    private Boolean allowOverlay;
    @ApiCloudField(value="为空表示不限制")
    private Integer overlayCount;
    @ApiCloudField(value="coupon_incompatible")
    private Boolean couponIncompatible;
}
