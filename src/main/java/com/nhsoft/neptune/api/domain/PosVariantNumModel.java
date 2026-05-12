package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosVariantNum模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosVariantNumModel extends ApiCloudObject {

    @ApiCloudField(value="item_num")
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
}
