package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SpiInnerResponseObject模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SpiInnerResponseObjectModel extends ApiCloudObject {

    @ApiCloudField(value="code")
    private Integer code;
    @ApiCloudField(value="msg")
    private String msg;
    @ApiCloudField(value="trace_id")
    private String traceId;
    @ApiCloudField(value="result")
    private Object result;
}
