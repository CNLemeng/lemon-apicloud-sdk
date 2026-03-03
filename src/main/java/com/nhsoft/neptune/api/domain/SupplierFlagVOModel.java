package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierFlagVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierFlagVOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商标签编码", example="19")
    private Integer supplierFlagNum;
    @ApiCloudField(value="门店编号", example="1")
    private Integer branchNum;
    @ApiCloudField(value="供应商标签名称", example="测试供应商")
    private String supplierFlagName;
    @ApiCloudField(value="最后修改时间", example="2025-01-01 00:00:00")
    private String supplierFlagLastEditTime;
}
