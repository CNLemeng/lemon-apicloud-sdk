package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypeFullyVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypeFullyVOModel extends ApiCloudObject {

    @ApiCloudField(value="coupon_type")
    private MemberCouponTypeVOModel couponType;
    @ApiCloudField(value="online_info")
    private MercuryCouponTypeParamDTOModel onlineInfo;
    @ApiCloudField(value="offline_info")
    private AmaCouponTypeParamDTOModel offlineInfo;
}
