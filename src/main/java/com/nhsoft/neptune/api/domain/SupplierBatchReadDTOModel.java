package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierBatchReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierBatchReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码列表", example="[43440001]", required=true)
    private List<Integer> supplierNums;
}
