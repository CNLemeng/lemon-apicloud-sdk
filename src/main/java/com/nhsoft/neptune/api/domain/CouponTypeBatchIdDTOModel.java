package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponTypeBatchIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponTypeBatchIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="type_ids", required=true)
    private List<Long> typeIds;
}
