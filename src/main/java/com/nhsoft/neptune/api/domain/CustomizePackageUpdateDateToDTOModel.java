package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomizePackageUpdateDateToDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomizePackageUpdateDateToDTOModel extends ApiCloudObject {

    @ApiCloudField(value="自选套餐编号", example="996750000013", required=true)
    private String customizePackageNo;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="结束日期，不得早于当天和套餐开始日期", example="2026-12-31", required=true)
    private String dateTo;
}
