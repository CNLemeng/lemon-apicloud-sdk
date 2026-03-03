package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponTypeGroupVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponTypeGroupVOModel extends ApiCloudObject {

    @ApiCloudField(value="券分组id")
    private Long id;
    @ApiCloudField(value="券分组名称")
    private String name;
    @ApiCloudField(value="创建时间", example="2026-01-01 00:00:00")
    private String createAt;
}
