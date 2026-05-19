package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierFindByFlagDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierFindByFlagDTOModel extends ApiCloudObject {

    @ApiCloudField(value="supplier_flag_nums", example="[1]", required=true)
    private List<Integer> supplierFlagNums;
}
