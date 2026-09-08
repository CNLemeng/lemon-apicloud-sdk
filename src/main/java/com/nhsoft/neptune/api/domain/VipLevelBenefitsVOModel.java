package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * VipLevelBenefitsVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VipLevelBenefitsVOModel extends ApiCloudObject {

    @ApiCloudField(value="offline_benefits")
    private VipLevelOfflineBenefitsVOModel offlineBenefits;
    @ApiCloudField(value="online_benefits")
    private VipLevelOnlineBenefitsVOModel onlineBenefits;
}
