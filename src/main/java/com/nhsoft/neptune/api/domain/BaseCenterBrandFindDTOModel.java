package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseCenterBrandFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseCenterBrandFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="ignore_deleted", example="true")
    private Boolean ignoreDeleted;
    @ApiCloudField(value="keyword", example="10001")
    private String keyword;
    @ApiCloudField(value="last_update_time", example="2026-01-01 00:00:00")
    private String lastUpdateTime;
}
