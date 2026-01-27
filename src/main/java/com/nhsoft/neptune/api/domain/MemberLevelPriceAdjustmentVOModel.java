package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberLevelPriceAdjustmentVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberLevelPriceAdjustmentVOModel extends ApiCloudObject {

    @ApiCloudField(value="会员等级价格调整编号", example="DJTJ9967520260000002")
    private String memberLevelPriceAdjustmentFid;
}
