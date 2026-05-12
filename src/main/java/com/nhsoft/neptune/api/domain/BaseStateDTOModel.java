package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseStateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseStateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="state_code")
    private Integer stateCode;
    @ApiCloudField(value="state_name")
    private String stateName;
}
