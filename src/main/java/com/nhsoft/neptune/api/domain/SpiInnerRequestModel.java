package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SpiInnerRequest模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SpiInnerRequestModel extends ApiCloudObject {

    @ApiCloudField(value="spi_key")
    private String spiKey;
    @ApiCloudField(value="trace_id")
    private String traceId;
    @ApiCloudField(value="system_book_code")
    private String systemBookCode;
    @ApiCloudField(value="params")
    private Object params;
}
