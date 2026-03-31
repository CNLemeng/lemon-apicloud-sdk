package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出单号", example="MO4344990004979", required=true)
    private String outOrderFid;
}
