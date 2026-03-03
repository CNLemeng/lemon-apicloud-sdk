package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="customer_id", example="99675000001", required=true)
    private Long customerId;
}
