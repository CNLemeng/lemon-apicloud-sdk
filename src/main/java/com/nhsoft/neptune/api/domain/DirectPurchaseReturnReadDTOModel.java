package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DirectPurchaseReturnReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DirectPurchaseReturnReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商直退单", example="PR99675010000049", required=true)
    private String returnOrderFid;
}
