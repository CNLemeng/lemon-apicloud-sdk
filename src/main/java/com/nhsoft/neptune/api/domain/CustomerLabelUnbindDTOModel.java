package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerLabelUnbindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerLabelUnbindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="customer_id", example="99675000001", required=true)
    private Long customerId;
    @ApiCloudField(value="label_ids", required=true)
    private List<Long> labelIds;
}
