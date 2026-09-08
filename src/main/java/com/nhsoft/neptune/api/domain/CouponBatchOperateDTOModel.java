package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponBatchOperateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponBatchOperateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="barcodes", required=true)
    private List<String> barcodes;
    @ApiCloudField(value="memo", example="测试作废")
    private String memo;
}
