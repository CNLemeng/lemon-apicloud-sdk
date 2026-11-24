package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FundPaymentSupplierCountFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FundPaymentSupplierCountFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_id", example="72709")
    private Long branchId;
}
