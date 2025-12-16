package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettingTimeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettingTimeVOModel extends ApiCloudObject {

    @ApiCloudField(value="小时", example="1")
    private Integer hour;
    @ApiCloudField(value="分钟", example="1")
    private Integer minute;
    @ApiCloudField(value="秒", example="1")
    private Integer second;
    @ApiCloudField(value="纳秒", example="1")
    private Integer nano;
}
