package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderSupplierReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderSupplierReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="make_up_order_fid", example="9999101002727", required=true)
    private String makeUpOrderFid;
}
