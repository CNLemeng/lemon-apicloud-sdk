package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceabilityReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceabilityReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="code")
    private String code;
}
