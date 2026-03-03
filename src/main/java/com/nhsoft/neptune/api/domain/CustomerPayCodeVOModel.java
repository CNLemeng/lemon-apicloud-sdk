package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerPayCodeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerPayCodeVOModel extends ApiCloudObject {

    @ApiCloudField(value="付款码", example="9738835835118")
    private String payCode;
}
