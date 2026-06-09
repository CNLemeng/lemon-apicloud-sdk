package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderSourceWithRequestSourceParamVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderSourceWithRequestSourceParamVOModel extends ApiCloudObject {

    @ApiCloudField(value="order_sources")
    private List<AmaOrderSourceVOModel> orderSources;
    @ApiCloudField(value="enable_request_source")
    private Boolean enableRequestSource;
}
