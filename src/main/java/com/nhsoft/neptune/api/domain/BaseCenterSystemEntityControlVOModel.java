package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BaseCenterSystemEntityControlVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseCenterSystemEntityControlVOModel extends ApiCloudObject {

    @ApiCloudField(value="biz_num", example="996750000001")
    private String bizNum;
    @ApiCloudField(value="controlled_flag", example="true")
    private Boolean controlledFlag;
}
