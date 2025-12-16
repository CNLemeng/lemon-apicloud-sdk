package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * LimitBuyCrowdMemberLevelVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LimitBuyCrowdMemberLevelVOModel extends ApiCloudObject {

    @ApiCloudField(value="等级名称", example="会员等级名称")
    private String levelName;
    @ApiCloudField(value="等级RANK", example="1")
    private Long levelRank;
}
