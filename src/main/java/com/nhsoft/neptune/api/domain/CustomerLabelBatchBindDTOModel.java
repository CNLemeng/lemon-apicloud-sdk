package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerLabelBatchBindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerLabelBatchBindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="customer_ids", example="[99675000001]", required=true)
    private List<Long> customerIds;
    @ApiCloudField(value="label_ids", required=true)
    private List<Long> labelIds;
}
