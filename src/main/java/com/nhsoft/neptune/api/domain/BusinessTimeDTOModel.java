package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BusinessTimeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessTimeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="begin_time")
    private String beginTime;
    @ApiCloudField(value="end_time")
    private String endTime;
    @ApiCloudField(value="monday", example="true")
    private Boolean monday;
    @ApiCloudField(value="tuesday", example="true")
    private Boolean tuesday;
    @ApiCloudField(value="wednesday", example="true")
    private Boolean wednesday;
    @ApiCloudField(value="thursday", example="true")
    private Boolean thursday;
    @ApiCloudField(value="friday", example="true")
    private Boolean friday;
    @ApiCloudField(value="saturday", example="true")
    private Boolean saturday;
    @ApiCloudField(value="sunday", example="true")
    private Boolean sunday;
    @ApiCloudField(value="group")
    private Long group;
}
