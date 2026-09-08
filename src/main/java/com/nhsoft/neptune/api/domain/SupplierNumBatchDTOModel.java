package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierNumBatchDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierNumBatchDTOModel extends ApiCloudObject {

    @ApiCloudField(value="supplier_nums", example="[99675000001]", required=true)
    private List<Integer> supplierNums;
}
