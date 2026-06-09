package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AmaOrderSourceVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AmaOrderSourceVOModel extends ApiCloudObject {

    @ApiCloudField(value="source_id")
    private String sourceId;
    @ApiCloudField(value="system_book_code")
    private String systemBookCode;
    @ApiCloudField(value="source_name")
    private String sourceName;
    @ApiCloudField(value="enabled")
    private Boolean enabled;
    @ApiCloudField(value="update_time")
    private String updateTime;
}
