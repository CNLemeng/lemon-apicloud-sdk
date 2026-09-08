package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderWholesaleTypeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderWholesaleTypeVOModel extends ApiCloudObject {

    @ApiCloudField(value="type_code", example="a0001")
    private String typeCode;
    @ApiCloudField(value="type_name", example="访销")
    private String typeName;
}
