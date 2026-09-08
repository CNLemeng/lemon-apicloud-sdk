package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CallCenterOrderIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CallCenterOrderIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_id", required=true)
    private String orderId;
}
