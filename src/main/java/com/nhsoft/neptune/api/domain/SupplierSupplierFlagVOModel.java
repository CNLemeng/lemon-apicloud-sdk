package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierSupplierFlagVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierSupplierFlagVOModel extends ApiCloudObject {

    @ApiCloudField(value="supplier_num", example="9967500001")
    private Integer supplierNum;
    @ApiCloudField(value="supplier_flags")
    private List<SupplierFlagVOModel> supplierFlags;
}
