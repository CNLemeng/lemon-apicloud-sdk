package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderSupplierAuditDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderSupplierAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="make_up_order_fid")
    private String makeUpOrderFid;
}
