package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TwoStringValueData模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TwoStringValueDataModel extends ApiCloudObject {

    @ApiCloudField(value="key")
    private String key;
    @ApiCloudField(value="value")
    private String value;
    @ApiCloudField(value="temp")
    private String temp;
}
