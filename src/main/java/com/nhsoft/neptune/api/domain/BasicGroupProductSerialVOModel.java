package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicGroupProductSerialVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicGroupProductSerialVOModel extends ApiCloudObject {

    @ApiCloudField(value="group_id")
    private Long groupId;
    @ApiCloudField(value="product_id")
    private Long productId;
    @ApiCloudField(value="serial_num")
    private Integer serialNum;
}
